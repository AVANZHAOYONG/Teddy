package com.css.cn.cainiao.Strategy;

public class App {
	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new OpearationAdd());
		int add = context.excute(10, 12);
		System.out.println("add:"+add);
		
		context.setStrategy(new OpearationSub());
		int sub = context.excute(10, 12);
		System.out.println("sub:"+sub);
		context.setStrategy(new OpearationMulti());
		int multi = context.excute(10, 12);
		System.out.println("multi:"+multi);
		
		
	}

}
