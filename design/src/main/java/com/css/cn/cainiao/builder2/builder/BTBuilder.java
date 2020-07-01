package com.css.cn.cainiao.builder2.builder;

import com.css.cn.builder2.entries.BTCar;
import com.css.cn.builder2.entries.Car;

public class BTBuilder implements builder {
	private Car car = new BTCar();
	

	@Override
	public builder setWheel(String wheel) {
		car.setWheel(wheel);
		return this;
	}

	@Override
	public builder setModel(String model) {
		car.setModel("本田:"+model);
		return this;
	}

	@Override
	public builder setPrice(double price) {
		car.setPrice(price);
		return this;
	}

	@Override
	public Car build() {
		return car;
	}
	
	

}
