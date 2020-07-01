package com.css.cn.cainiao.ServiceLocator.entries;

public class Service1 implements Services {

	@Override
	public String getName() {
		return "Service1";
	}

	@Override
	public void excute() {
		System.out.println("excute Service1");
	}

}
