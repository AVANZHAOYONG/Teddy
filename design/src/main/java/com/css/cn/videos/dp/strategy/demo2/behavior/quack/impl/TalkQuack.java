package com.css.cn.videos.dp.strategy.demo2.behavior.quack.impl;

import com.css.cn.videos.dp.strategy.demo2.behavior.quack.QuackBehavior;

public class TalkQuack implements QuackBehavior {

	@Override
	public void quack() throws Exception {
		System.out.println("我能说人话");
		
	}

}
