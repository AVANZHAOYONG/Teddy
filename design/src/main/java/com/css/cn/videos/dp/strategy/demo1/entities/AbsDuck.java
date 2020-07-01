package com.css.cn.videos.dp.strategy.demo1.entities;

/**
 * 提高代码复用 使用继承
 * @author 赵勇
 *
 */
public abstract class AbsDuck implements Duck {

	@Override
	public void swim() {
		System.out.println("所有鸭子都会游泳");

	}

}
