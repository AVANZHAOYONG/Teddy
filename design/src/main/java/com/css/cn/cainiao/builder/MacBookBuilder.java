package com.css.cn.cainiao.builder;

import com.css.cn.cainiao.builder.entries.MacBook;
import com.css.cn.cainiao.builder.entries.computer;

public class MacBookBuilder implements builder {
	
	private computer com = new MacBook();

	@Override
	public builder setName(String name) {
		com.setName(name);
		return this;
	}

	@Override
	public builder setPrice(double price) {
		com.setPrice(price);
		return this;
	}

	@Override
	public builder setOs() {
		com.setOs();
		return this;
	}

	@Override
	public computer build() {
		return com;
	}

	public static builder getBuilder() {
		return new MacBookBuilder();
	}
	
}
