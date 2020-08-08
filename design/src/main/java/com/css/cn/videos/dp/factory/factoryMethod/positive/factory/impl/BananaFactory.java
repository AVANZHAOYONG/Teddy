package com.css.cn.videos.dp.factory.factoryMethod.positive.factory.impl;

import com.css.cn.videos.dp.factory.factoryMethod.positive.entities.Food;
import com.css.cn.videos.dp.factory.factoryMethod.positive.entities.impl.Banana;
import com.css.cn.videos.dp.factory.factoryMethod.positive.factory.FoodFactoy;

public class BananaFactory implements FoodFactoy {

	@Override
	public Food getFood() {
		return new Banana();
	}

}
