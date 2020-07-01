package com.css.cn.videos.dp.strategy.demo2.behavior.quack.impl;

import org.css.com.dp.strategy.demo2.behavior.quack.QuackBehavior;

public class NoQuack implements QuackBehavior {

	@Override
	public void quack() throws Exception {
		System.out.println("我能说人话");
		
	}

}
