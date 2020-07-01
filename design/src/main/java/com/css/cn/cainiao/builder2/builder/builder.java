package com.css.cn.cainiao.builder2.builder;

import com.css.cn.builder2.entries.Car;

public interface builder {

	builder setWheel(String wheel);
	builder setModel(String model);
	builder setPrice(double price);
	Car build();
}
