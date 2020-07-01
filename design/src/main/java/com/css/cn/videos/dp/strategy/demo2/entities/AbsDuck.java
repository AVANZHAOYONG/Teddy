package com.css.cn.videos.dp.strategy.demo2.entities;

import com.css.cn.videos.dp.strategy.demo2.behavior.fly.FlyBehavior;
import com.css.cn.videos.dp.strategy.demo2.behavior.quack.QuackBehavior;

/**
 * 提高代码复用 使用继承
 * @author 赵勇
 *
 */
public abstract class AbsDuck implements Duck {
	
	private FlyBehavior fb;
	private QuackBehavior qb ; 
	
	

	public AbsDuck(FlyBehavior fb, QuackBehavior qb) {
		super();
		this.fb = fb;
		this.qb = qb;
	}

	public void fly() throws Exception {
		fb.fly();
	}
	
	public void quack() throws Exception {
		qb.quack();
	}


	public FlyBehavior getFb() {
		return fb;
	}




	public void setFb(FlyBehavior fb) {
		this.fb = fb;
	}




	public QuackBehavior getQb() {
		return qb;
	}




	public void setQb(QuackBehavior qb) {
		this.qb = qb;
	}




	@Override
	public void swim() {
		System.out.println("所有鸭子都会游泳");

	}

}
