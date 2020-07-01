package com.css.cn.cainiao.entries;

public class CustomerFactory {
	
	public static final String[] names = new String[] {
			"jhon",
			"juily",
			"tom",
			"cat"
	} ;
	public static Customer getName(String name) {
		for (String sn : names) {
			if(sn.equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}

}
