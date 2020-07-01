package com.css.cn.videos.dp.strategy.demo1.entities;

import com.css.cn.videos.dp.strategy.demo1.quack.QuackAble;

public class RubberDuck extends AbsDuck implements QuackAble {

	@Override
	public void display() {
		System.out.println("机器鸭");
	}

	@Override
	public void quack() {
		System.out.println("我会叫");
	}

}
