package com.css.cn.videos.principle.dependencyInversion.positive;

import org.css.com.principle.dependencyInversion.entries.Animals;
import org.css.com.principle.dependencyInversion.entries.Cat;
import org.css.com.principle.dependencyInversion.entries.Dog;

public class DependencyInversionPositive {
	
	public void feed(Animals animal) {
		animal.eat("bone");
	}
	
	
	public static void main(String[] args) {
		DependencyInversionPositive din = new DependencyInversionPositive();
		din.feed(new Dog());
		din.feed(new Cat());
		
		//都可以了  依赖倒置
	}

}
