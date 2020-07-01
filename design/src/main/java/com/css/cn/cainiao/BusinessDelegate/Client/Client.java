package com.css.cn.cainiao.BusinessDelegate.Client;

import com.css.cn.cainiao.BusinessDelegate.BusinessDelegate.BusinessDelegate;

public class Client {
	private BusinessDelegate bd;

	public Client(BusinessDelegate bd) {
		super();
		this.bd = bd;
	}
	
	public void doTask() {
		System.out.println(bd.doTask());
	}
	
}
