package com.css.cn.cainiao.Command;

import com.css.cn.Command.Command.Stock;
import com.css.cn.Command.invoke.Broker;
import com.css.cn.Command.received.BuyStock;
import com.css.cn.Command.received.Order;
import com.css.cn.Command.received.SellStock;

public class App {
	public static void main(String[] args) {
		Stock stock = new Stock();
		
		Order stock2 = new BuyStock(stock);
		Order stock3 = new SellStock(stock);
		
		Broker broker = new Broker();
		
		broker.takerOrder(stock2);
		broker.takerOrder(stock3);
		
		broker.placeOrder();
		
	}

}
