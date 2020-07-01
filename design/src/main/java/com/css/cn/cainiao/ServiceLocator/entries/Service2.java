package com.css.cn.cainiao.ServiceLocator.entries;

public class Service2 implements Services {

	@Override
	public String getName() {
		return "Service2";
	}

	@Override
	public void excute() {
		System.out.println("excute service2");
	}
	

}
