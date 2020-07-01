package com.css.cn.videos.dp.strategy.demo1.entities;

import org.css.com.dp.strategy.demo1.fly.FlyAble;
import org.css.com.dp.strategy.demo1.quack.QuackAble;

public class WildDuck extends AbsDuck implements QuackAble,FlyAble{

	@Override
	public void display() {
		System.out.println("野鸭");
	}

	@Override
	public void quack() {
		System.out.println("我会叫");
	}

	@Override
	public void fly() {
		System.out.println("我会飞");
		
	}

}
