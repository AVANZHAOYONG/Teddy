package org.netty.com.server;

import org.netty.com.server.stub.server.NettyRPCServer;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	new NettyRPCServer(9999).start();
    }
}
