package com.css.cn.videos.dp.factory.factoryMethod.positive;

import org.css.com.dp.factory.factoryMethod.positive.entities.Food;
import org.css.com.dp.factory.factoryMethod.positive.factory.FoodFactoy;
import org.css.com.dp.factory.factoryMethod.positive.factory.impl.AppleFactory;

public class Positive {
	public static void main(String[] args) {
		FoodFactoy factory = new AppleFactory();
		
		Food food = factory.getFood();
		food.eat();
		
	}

}
