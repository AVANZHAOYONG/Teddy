package com.css.cn.cainiao.state;

public class App {

	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new StartState());
		context.close();
		context.start();
		
	}
}
