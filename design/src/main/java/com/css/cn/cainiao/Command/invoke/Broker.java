package com.css.cn.cainiao.Command.invoke;

import java.util.ArrayList;
import java.util.List;

import com.css.cn.cainiao.Command.received.Order;

public class Broker {
	private List<Order> orderList =  new ArrayList<Order>();
	
	public void takerOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrder() {
		for (Order order : orderList) {
			order.excute();
		}
		orderList.clear();
	}
	
}
