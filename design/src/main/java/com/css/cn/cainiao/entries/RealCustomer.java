package com.css.cn.cainiao.entries;

public class RealCustomer implements Customer {

	private String name ;
	
	
	
	public RealCustomer(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean isNill() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

}
