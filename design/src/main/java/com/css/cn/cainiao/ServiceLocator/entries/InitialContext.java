package com.css.cn.cainiao.ServiceLocator.entries;

public class InitialContext {
	
	public Services lookUp(String serName) {
		if("Service1".equalsIgnoreCase(serName)) {
			return new Service1();
		}else if("Service2".equalsIgnoreCase(serName)) {
			return new Service2();
		}
		return null;
	}

}
