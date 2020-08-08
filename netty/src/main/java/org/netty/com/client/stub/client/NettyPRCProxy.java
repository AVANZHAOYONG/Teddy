package org.netty.com.client.stub.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.netty.com.client.stub.handler.ResultHandler;
import org.netty.com.common.info.ClassInfo;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

public class NettyPRCProxy {

	public static Object create(Class target) {
		return Proxy.newProxyInstance(target.getClassLoader(), new Class[] { target }, new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				ClassInfo classInfo = new ClassInfo();
				classInfo.setClassName(target.getName());
				classInfo.setMethodName(method.getName());
				classInfo.setArgs(args);
				classInfo.setTypes(method.getParameterTypes());

				EventLoopGroup group = new NioEventLoopGroup();
				ResultHandler resultHandler = new ResultHandler();
				try {
					Bootstrap b = new Bootstrap();
					b.group(group).channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {
						@Override
						public void initChannel(SocketChannel ch) throws Exception {
							ChannelPipeline pipeline = ch.pipeline();
							// 编码器
							pipeline.addLast("encoder", new ObjectEncoder());
							// 解码器
							pipeline.addLast("decoder",
									new ObjectDecoder(Integer.MAX_VALUE, ClassResolvers.cacheDisabled(null)));
							// 客户端业务处理类
							pipeline.addLast("handler", resultHandler);
						}
					});
					ChannelFuture future = b.connect("127.0.0.1", 9999).sync();
					future.channel().writeAndFlush(classInfo).sync();
					future.channel().closeFuture().sync();
				} finally {
					group.shutdownGracefully();
				}
				return resultHandler.getResponse();
			}
		});
	}
}
