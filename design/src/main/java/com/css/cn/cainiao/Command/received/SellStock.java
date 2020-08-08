package com.css.cn.cainiao.Command.received;

import com.css.cn.cainiao.Command.Command.AbsStock;

public class SellStock implements Order {

	private AbsStock stock  ;
	
	
	
	public SellStock(AbsStock stock) {
		super();
		this.stock = stock;
	}



	@Override
	public void excute() {
		stock.sell();
	}

}
