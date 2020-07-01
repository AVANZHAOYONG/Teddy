package com.css.cn.videos.dp.decorator.decorator.impl;

import org.css.com.dp.decorator.component.Component;
import org.css.com.dp.decorator.decorator.Decorator;

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
