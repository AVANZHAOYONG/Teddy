package com.css.cn.cainiao.Command.Command;

public class Stock implements AbsStock {

	@Override
	public void buy() {
		System.out.println("stock buy");
	}

	@Override
	public void sell() {
		System.out.println("stock sell");
	}

}
