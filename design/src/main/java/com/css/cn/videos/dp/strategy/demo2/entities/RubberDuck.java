package com.css.cn.videos.dp.strategy.demo2.entities;

import com.css.cn.videos.dp.strategy.demo2.behavior.fly.FlyBehavior;
import com.css.cn.videos.dp.strategy.demo2.behavior.quack.QuackBehavior;

public class RubberDuck extends AbsDuck {

	public RubberDuck(FlyBehavior fb, QuackBehavior qb) {
		super(fb, qb);
	}

	@Override
	public void display() {
		System.out.println("机器鸭");
	}


}
