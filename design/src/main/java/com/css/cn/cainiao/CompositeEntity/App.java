package com.css.cn.cainiao.CompositeEntity;

import com.css.cn.cainiao.CompositeEntity.Client.Client;

public class App {
	public static void main(String[] args) {
		Client client = new Client();
		client.setData("ihao", "time");
		client.printeData();
	}

}
