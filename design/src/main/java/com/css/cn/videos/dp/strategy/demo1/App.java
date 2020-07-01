package com.css.cn.videos.dp.strategy.demo1;

import org.css.com.dp.strategy.demo1.entities.RubberDuck;
import org.css.com.dp.strategy.demo1.entities.WildDuck;

public class App {
	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.swim();
		wildDuck.display();
		wildDuck.fly();
		wildDuck.quack();
		
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.swim();
		rubberDuck.display();
//		rubberDuck.fly();
		rubberDuck.quack();
		
	}

}
