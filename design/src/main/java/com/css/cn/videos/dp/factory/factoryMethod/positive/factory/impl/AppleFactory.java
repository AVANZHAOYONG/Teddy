package com.css.cn.videos.dp.factory.factoryMethod.positive.factory.impl;

import org.css.com.dp.factory.factoryMethod.positive.entities.Food;
import org.css.com.dp.factory.factoryMethod.positive.entities.impl.Apple;
import org.css.com.dp.factory.factoryMethod.positive.factory.FoodFactoy;

public class AppleFactory implements FoodFactoy {

	@Override
	public Food getFood() {
		return new Apple();
	}

}
