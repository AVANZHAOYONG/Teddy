package com.css.cn.videos.dp.factory.factoryMethod.positive.factory.impl;

import org.css.com.dp.factory.factoryMethod.positive.entities.Food;
import org.css.com.dp.factory.factoryMethod.positive.entities.impl.Pear;
import org.css.com.dp.factory.factoryMethod.positive.factory.FoodFactoy;

public class PearFactory implements FoodFactoy {

	@Override
	public Food getFood() {
		return new Pear();
	}

}
