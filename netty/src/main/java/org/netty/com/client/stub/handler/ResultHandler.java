package org.netty.com.client.stub.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ResultHandler extends ChannelInboundHandlerAdapter {

	private Object response;
	public Object getResponse() {
		return response;
	}
	
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		response = msg;
		ctx.close();
	}
}
