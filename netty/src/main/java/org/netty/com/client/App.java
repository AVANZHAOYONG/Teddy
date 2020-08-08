package org.netty.com.client;

import org.netty.com.client.stub.client.NettyPRCProxy;
import org.netty.com.common.service.HelloRpc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	//第 1 次远程调用
//    	HelloNetty helloNetty=(HelloNetty) NettyPRCProxy.create(HelloNetty.class);
//    	System.out.println(helloNetty.hello());
    	//第 2 次远程调用
    	HelloRpc helloRPC = (HelloRpc) NettyPRCProxy.create(HelloRpc.class);
    	System.out.println(helloRPC.hello("RP"));
    }
}
