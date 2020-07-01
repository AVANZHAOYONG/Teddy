package com.css.cn.cainiao.ServiceLocator;

import com.css.cn.ServiceLocator.ServiceLocator.ServiceLocator;
import com.css.cn.ServiceLocator.entries.Services;

public class App {
	
	public static void main(String[] args) {
		ServiceLocator serviceLocator = new ServiceLocator();
		Services services = serviceLocator.getServices("Service1");
		services.excute();
		Services services2 = serviceLocator.getServices("Service2");
		services2.excute();
	}

}
