package com.css.cn.videos.dp.strategy.demo2.behavior.fly.impl;

import org.css.com.dp.strategy.demo2.behavior.fly.FlyBehavior;

public class NoFlyBehavior implements FlyBehavior {

	@Override
	public void fly() throws Exception {
		throw new Exception();
		
	}

}
