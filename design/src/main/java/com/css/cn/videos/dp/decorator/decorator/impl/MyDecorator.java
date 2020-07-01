package com.css.cn.videos.dp.decorator.decorator.impl;

import com.css.cn.videos.dp.decorator.component.Component;
import com.css.cn.videos.dp.decorator.decorator.Decorator;

public class MyDecorator implements Decorator {
	
	private Component com ; 

	public MyDecorator(Component com) {
		this.com = com;
	}
	
	@Override
	public double cost() {
		return com.cost() + 56.01;
	}

}
