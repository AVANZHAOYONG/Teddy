package com.css.cn.cainiao.builder2.conductor;

import com.css.cn.builder2.builder.builder;
import com.css.cn.builder2.entries.Car;

public class Director {
	private builder build = null;

	public Director(builder build) {
		super();
		this.build = build;
	}
	
	public Car construct() {
		build.setModel("CRV");
		build.setWheel("4轮");
		build.setPrice(300000.00);
		return build.build();
	}
	
}
