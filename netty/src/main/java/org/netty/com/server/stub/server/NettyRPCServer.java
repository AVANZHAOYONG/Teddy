package org.netty.com.server.stub.server;

import org.netty.com.server.stub.handler.InvokeHandler;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class NettyRPCServer {
	
	private int port;

	public NettyRPCServer(int port) {
		super();
		this.port = port;
	}
	
	public void start() {
		EventLoopGroup bossGroup = new NioEventLoopGroup();
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		ChannelInitializer<SocketChannel> chInit = SerChannelIntializer.builder()
				.setChannelHandler(new InvokeHandler());
		try {
		ServerBootstrap serverBootstrap = new ServerBootstrap();
		serverBootstrap.group(bossGroup, workerGroup)//设置线程组
			.channel(NioServerSocketChannel.class)// 使用socket实现通道
			.option(ChannelOption.SO_BACKLOG, 128)//设置通道申请时等待队列长度
			.childOption(ChannelOption.SO_KEEPALIVE, true)//设置通道保活
			.localAddress(port) //端口
			.childHandler(chInit);//设置初始化hanlder
		

			ChannelFuture future = serverBootstrap.bind(port).sync();//设置端口为 非阻塞。但是 sync方法会等待当前全部完成后 往下执行。
			
			System.out.println("...Server is ready...");
			
			future.channel().closeFuture().sync();
			
			System.out.println("ok");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			bossGroup.shutdownGracefully();
			workerGroup.shutdownGracefully();
		}
		
		
	}

}
