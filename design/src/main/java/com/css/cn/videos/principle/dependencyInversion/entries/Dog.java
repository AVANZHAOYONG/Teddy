package com.css.cn.videos.principle.dependencyInversion.entries;

public class Dog implements Animals {

	@Override
	public void eat(String food) {
		System.out.println("Dog eat " + food);
	}

}
