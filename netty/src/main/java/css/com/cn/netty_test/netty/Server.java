package css.com.cn.netty_test.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.CharsetUtil;

public class Server {
	
	
	public static void main(String[] args) {
		int port = 1234;
		new Thread(() ->{
			Server.run(port);
		}).start();
		System.out.println("Server started ...");
	}
	
	public static void run (int port) {
		//线程池 用于接收客户端传过来的请求 parantGroup
		NioEventLoopGroup bossrGroup = new NioEventLoopGroup();
		//线程池 bossrGroup接收到 请求后，由workerGroup处理  childGroup
		NioEventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			ServerBootstrap bootStrap = new ServerBootstrap();
			bootStrap.group(bossrGroup, workerGroup)
			.channel(NioServerSocketChannel.class)
			.childHandler(new ChannelInitializer<SocketChannel>() {

				@Override
				protected void initChannel(SocketChannel ch) throws Exception {
					ChannelPipeline pipeline = ch.pipeline();
					//http的编辑码器
					pipeline.addLast("httpServerCodec", new HttpServerCodec());
					pipeline.addLast("aggregator", new HttpObjectAggregator(65536));
					pipeline.addLast("httpServerHandler", new SimpleChannelInboundHandler<FullHttpRequest>() {

						@Override
						protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest msg) throws Exception {
								FullHttpRequest req = msg;
								
								ByteBuf buf = req.content();
								System.out.println("content:" + buf.toString(CharsetUtil.UTF_8));
								
								ByteBuf copiedBuffer = Unpooled.copiedBuffer("hello world",CharsetUtil.UTF_8);
								
								FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK,copiedBuffer);
								
						        response.headers().add(HttpHeaderNames.CONTENT_TYPE, "text/plain");
						        response.headers().add(HttpHeaderNames.CONTENT_LENGTH, copiedBuffer.readableBytes());
						        ctx.writeAndFlush(response);
						}
						
					});
					
				}
			});
			//开启端口 sync阻塞线程 直到 端口申请完成。
			ChannelFuture future = bootStrap.bind(port).sync();
			//阻塞线程 直至服务器的channel关闭
			future.channel().closeFuture().sync();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			bossrGroup.shutdownGracefully();
			workerGroup.shutdownGracefully();
		}
	}

}
