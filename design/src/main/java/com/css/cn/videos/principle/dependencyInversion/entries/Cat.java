package com.css.cn.videos.principle.dependencyInversion.entries;

public class Cat implements Animals {

	@Override
	public void eat(String food) {
		System.out.println("Cat eat "+ food);
	}

}
