package com.css.cn.cainiao.BusinessDelegate;

import com.css.cn.cainiao.BusinessDelegate.BusinessDelegate.BusinessDelegate;
import com.css.cn.cainiao.BusinessDelegate.Client.Client;

public class App {
	
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate("EJB");
		Client client = new Client(businessDelegate);
		client.doTask();
	}

}
