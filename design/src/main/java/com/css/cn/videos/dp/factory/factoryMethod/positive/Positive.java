package com.css.cn.videos.dp.factory.factoryMethod.positive;

import com.css.cn.videos.dp.factory.factoryMethod.positive.entities.Food;
import com.css.cn.videos.dp.factory.factoryMethod.positive.factory.FoodFactoy;
import com.css.cn.videos.dp.factory.factoryMethod.positive.factory.impl.AppleFactory;

public class Positive {
	public static void main(String[] args) {
		FoodFactoy factory = new AppleFactory();
		
		Food food = factory.getFood();
		food.eat();
		
	}

}
