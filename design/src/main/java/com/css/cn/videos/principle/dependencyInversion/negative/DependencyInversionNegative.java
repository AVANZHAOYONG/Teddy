package com.css.cn.videos.principle.dependencyInversion.negative;

import org.css.com.principle.dependencyInversion.entries.Cat;
import org.css.com.principle.dependencyInversion.entries.Dog;

public class DependencyInversionNegative {
	
	public void feed(Dog dog) {
		dog.eat("bone");
	}
	
	public void feed(Cat cat) {
		cat.eat("fish");
	}
	
	public static void main(String[] args) {
		DependencyInversionNegative din = new DependencyInversionNegative();
		din.feed(new Dog());
		din.feed(new Cat());
		
		//如果还需要喂 老虎呢？需要改变 此类？
	}

}
