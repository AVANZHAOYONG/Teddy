package com.css.cn.cainiao.proxy;

import com.css.cn.proxy.entries.Inter;
import com.css.cn.proxy.entries.ProxyReal;

public class App {
	public static void main(String[] args) {
		Inter real = new ProxyReal("test.jpg");
		real.display();
	}

}
