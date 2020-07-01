package com.css.cn.cainiao.ServiceLocator.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.css.cn.cainiao.ServiceLocator.entries.Services;

public class MyCache {
	
	private Map<String , Services> sMap;

	public MyCache() {
		super();
		this.sMap =new ConcurrentHashMap<String, Services>();
	}
	
	public void addService(Services ser) {
		sMap.put(ser.getName(), ser);
	}

	public Services getServices(String key) {
		return sMap.get(key);
	}
	
	
}
