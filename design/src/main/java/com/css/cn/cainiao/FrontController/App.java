package com.css.cn.cainiao.FrontController;

public class App {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("student");
		frontController.dispatchRequest("home");
	}

}
