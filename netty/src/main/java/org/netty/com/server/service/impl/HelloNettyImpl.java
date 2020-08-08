package org.netty.com.server.service.impl;

import org.netty.com.common.service.HelloNetty;

public class HelloNettyImpl implements HelloNetty {

	@Override
	public String hello() {
		return "hello,netty";
	}

}
