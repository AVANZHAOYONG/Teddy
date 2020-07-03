package org.netty.com.server.stub.server;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

public class SerChannelIntializer extends ChannelInitializer<SocketChannel> {
	
	private ChannelHandler ch1 ; 
	
	private SerChannelIntializer() {
		
	}
	
	public static SerChannelIntializer builder() {
		return new SerChannelIntializer();
	}
	
	public SerChannelIntializer setChannelHandler(ChannelHandler ch1) {
		this.ch1 = ch1;
		return this;
	}

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();//获取pip
		
		pipeline.addLast("encoder",new ObjectEncoder());//编码器
		
		pipeline.addLast("decoder" ,new ObjectDecoder(Integer.MAX_VALUE,
				ClassResolvers.cacheDisabled(null)));//解码器
		
		pipeline.addLast(ch1);
		
	}

}
