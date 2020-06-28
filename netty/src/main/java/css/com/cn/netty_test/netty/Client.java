package css.com.cn.netty_test.netty;

import java.net.URI;

import io.netty.bootstrap.Bootstrap;
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
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpVersion;

public class Client {
	
	public static void main(String[] args) {
		String ip = "127.0.0.1";
		int port = 1234;
		new Thread(() ->{
			Client.run(ip, port);
		}).start();
		
		System.out.println("Client Started ...");
	}
	
	public static void run(String ip, int port) {
		NioEventLoopGroup group = new NioEventLoopGroup();
		try {
			Bootstrap b = new Bootstrap();
			b.group(group)
			.channel(NioSocketChannel.class)
			.handler(new ChannelInitializer<SocketChannel>() {

				@Override
				protected void initChannel(SocketChannel ch) throws Exception {
					ChannelPipeline pipeline = ch.pipeline();
					pipeline.addLast("httpcode", new HttpClientCodec());
					pipeline.addLast("aggregator", new HttpObjectAggregator(65536));
					pipeline.addLast("handler", new SimpleChannelInboundHandler<FullHttpResponse>() {

						@Override
						public void channelActive(ChannelHandlerContext ctx) throws Exception{
							 URI uri = new URI("http://127.0.0..1:8080");

							 String msg = "Are you ok?";
						     FullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET,
						                uri.toASCIIString(), Unpooled.wrappedBuffer(msg.getBytes("UTF-8")));
						 
						        // 构建http请求
//						        request.headers().set(HttpHeaderNames.HOST, "127.0.0.1");
//						        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
						        request.headers().set(HttpHeaderNames.CONTENT_LENGTH, request.content().readableBytes());
						        // 发送http请求
						        ctx.channel().writeAndFlush(request);
						}
						
						@Override
						protected void channelRead0(ChannelHandlerContext ctx, FullHttpResponse msg) throws Exception {
					        FullHttpResponse response = msg;
					        String content_type = response.headers().get(HttpHeaderNames.CONTENT_TYPE);
					        System.out.println(content_type);
					        ByteBuf buf = response.content();
					        System.out.println(buf.toString(io.netty.util.CharsetUtil.UTF_8));
						}
						
					});
				}
			});
			ChannelFuture future = b.connect(ip, port).sync();
//			Channel channel = future.channel();
			
			future.channel().closeFuture().sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			group.shutdownGracefully();
		}
	}
}
