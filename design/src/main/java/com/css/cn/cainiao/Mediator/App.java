package com.css.cn.cainiao.Mediator;

public class App {

	public static void main(String[] args) {
		User jhon = new User("jhon");
		User avan = new User("avan");
		jhon.sendMsg("hello,avan!");
		avan.sendMsg("hi~");
	}
}
