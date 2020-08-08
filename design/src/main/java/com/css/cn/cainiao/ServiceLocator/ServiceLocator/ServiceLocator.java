package com.css.cn.cainiao.ServiceLocator.ServiceLocator;

import com.css.cn.cainiao.ServiceLocator.cache.MyCache;
import com.css.cn.cainiao.ServiceLocator.entries.InitialContext;
import com.css.cn.cainiao.ServiceLocator.entries.Services;

public class ServiceLocator {
	private MyCache mycache ;
	private InitialContext init;

	public ServiceLocator() {
		super();
		this.mycache = new MyCache();
		this.init = new InitialContext();
	}
	
	public Services getServices(String key) {
		Services services = mycache.getServices(key);
		if(services!=null) {
			return services;
		}
		
		services = init.lookUp(key);
		if(services!=null) {
			mycache.addService(services);
			return services;
		}
		return services;
	}
	
	

}
