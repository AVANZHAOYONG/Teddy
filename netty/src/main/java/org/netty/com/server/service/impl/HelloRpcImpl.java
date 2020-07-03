package org.netty.com.server.service.impl;

import org.netty.com.common.service.HelloRpc;

public class HelloRpcImpl implements HelloRpc {

	@Override
	public String hello(String name) {
		return "hello,"+name;
	}

}
