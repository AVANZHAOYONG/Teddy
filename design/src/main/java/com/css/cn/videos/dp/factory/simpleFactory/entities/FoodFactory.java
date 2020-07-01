package com.css.cn.videos.dp.factory.simpleFactory.entities;

public class FoodFactory {
	
	public static Food getFood(String name) {
		Food food = null ;
		switch (name) {
		case "apple":
			food = new Apple();
			break;
		case "banana":
			food = new Banana();
			break;
		default:
			break;
		}
		
		return food;
	}

}
