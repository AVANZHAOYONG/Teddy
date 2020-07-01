package com.css.cn.cainiao.factory.factories;

public class GetFactory {
	
	//简单工厂模式 获取工厂类
	public static Provider GetFactory(String tp) {
		if("bj".equalsIgnoreCase(tp)) {
			return new BeiJingFactory();
		}else if("sh".equalsIgnoreCase(tp)) {
			return new ShangHaiFactory();
		}
		return null;
	}

}
