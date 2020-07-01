package com.css.cn.cainiao.entries;

public class NullCustomer implements Customer {

	@Override
	public boolean isNill() {
		return true;
	}

	@Override
	public String getName() {
		return "这是个null";
	}

}
