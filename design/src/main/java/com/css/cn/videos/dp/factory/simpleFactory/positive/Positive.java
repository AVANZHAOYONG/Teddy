package com.css.cn.videos.dp.factory.simpleFactory.positive;

import org.css.com.dp.factory.simpleFactory.entities.Food;
import org.css.com.dp.factory.simpleFactory.entities.FoodFactory;

public class Positive {
	
	/**
	 * 此时 还是有问题  扩展性不好。
	 * @param args
	 */
	public static void main(String[] args) {
		Food food = FoodFactory.getFood("apple");
		food.eat();
	}

}
