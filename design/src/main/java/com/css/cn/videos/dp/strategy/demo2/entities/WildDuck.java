package com.css.cn.videos.dp.strategy.demo2.entities;

import com.css.cn.videos.dp.strategy.demo2.behavior.fly.FlyBehavior;
import com.css.cn.videos.dp.strategy.demo2.behavior.quack.QuackBehavior;

public class WildDuck extends AbsDuck {

	public WildDuck(FlyBehavior fb, QuackBehavior qb) {
		super(fb, qb);
	}

	@Override
	public void display() {
		System.out.println("野鸭");
	}


}
