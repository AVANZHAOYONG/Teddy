package com.css.cn.videos.dp.agency;

import java.lang.reflect.Proxy;

public class App {
	
	public static void main(String[] args) {
		Calc target = new CalcImpl();
		Calc proxy = (Calc)Proxy.newProxyInstance(App.class.getClassLoader(), target.getClass().getInterfaces(), new MyHandler(target));
		double result = proxy.divide(100, 10);
		System.out.println(result);
		
	}

}
