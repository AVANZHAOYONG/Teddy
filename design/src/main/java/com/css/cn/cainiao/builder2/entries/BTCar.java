package com.css.cn.cainiao.builder2.entries;

public class BTCar implements Car {
	
	private String wheel;
	private String model;
	private double price;

	@Override
	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	@Override
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "wheel:"+wheel+
				",model:"+model+
				",price:"+price;
	}

}
