package com.css.cn.cainiao.Facade.entries;

public class stage implements Part {

	@Override
	public void start() {
		System.out.println("Start stage");
		
	}

	@Override
	public void shutdown() {
		System.out.println("shutdown stage");
		
	}
	
	

}
