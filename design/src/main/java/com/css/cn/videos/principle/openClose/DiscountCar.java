package com.css.cn.videos.principle.openClose;

public class DiscountCar extends Car {
@Override
public void setPrice(double price) {
	super.setPrice(price*0.8);
}
}
