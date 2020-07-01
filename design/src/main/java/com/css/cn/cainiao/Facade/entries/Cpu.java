package com.css.cn.cainiao.Facade.entries;

public class Cpu implements Part {

	@Override
	public void start() {
		System.out.println("Start cpu");
		
	}

	@Override
	public void shutdown() {
		System.out.println("shutdown cpu");
		
	}
	
	

}
