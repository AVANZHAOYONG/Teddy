package com.css.cn.cainiao.cglibProxy;

import com.css.cn.cainiao.cglibProxy.entries.Engineer;
import com.css.cn.cainiao.cglibProxy.proxy.CglibProxy;

public class App {
	public static void main(String[] args) {
		Engineer proxy = (Engineer)CglibProxy.getProxy(new Engineer());
		String eat = proxy.eat();
		System.out.println(eat);
		String work = proxy.work();
		System.out.println(work);
	}

}
