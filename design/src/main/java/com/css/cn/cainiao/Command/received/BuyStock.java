package com.css.cn.cainiao.Command.received;

import com.css.cn.cainiao.Command.Command.AbsStock;

public class BuyStock implements Order {

	private AbsStock stock;
	
	
	
	public BuyStock(AbsStock stock) {
		super();
		this.stock = stock;
	}



	@Override
	public void excute() {
		stock.buy();
	}

}
