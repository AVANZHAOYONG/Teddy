package com.css.cn.cainiao.Observer.entries;

public class observer1 implements Observer {

	@Override
	public void update(String data) {
		System.out.println("1 :" + data);
	}

}
