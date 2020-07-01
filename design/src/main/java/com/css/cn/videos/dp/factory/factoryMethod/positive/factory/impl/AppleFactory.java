package com.css.cn.videos.dp.factory.factoryMethod.positive.factory.impl;

import com.css.cn.videos.dp.factory.factoryMethod.positive.entities.Food;
import com.css.cn.videos.dp.factory.factoryMethod.positive.entities.impl.Apple;
import com.css.cn.videos.dp.factory.factoryMethod.positive.factory.FoodFactoy;

public class AppleFactory implements FoodFactoy {

	@Override
	public Food getFood() {
		return new Apple();
	}

}
