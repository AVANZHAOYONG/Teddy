package com.css.cn.cainiao.CompositeEntity.Client;

import com.css.cn.cainiao.CompositeEntity.CompositeEntity.Composite;

public class Client {
	private Composite com = new Composite();
	
	public void setData(String data1 , String data2) {
		com.setData(data1, data2);
	}
	
	public void printeData() {
		String[] data = com.getData();
		for (String string : data) {
			System.out.println(string);
		}
	}

}
