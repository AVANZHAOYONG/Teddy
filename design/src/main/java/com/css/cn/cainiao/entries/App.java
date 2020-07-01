package com.css.cn.cainiao.entries;

public class App {

	public static void main(String[] args) {
		System.out.println(CustomerFactory.getName("jhon").getName());
		System.out.println(CustomerFactory.getName("jhon1").getName());
		System.out.println(CustomerFactory.getName("tom").getName());
		System.out.println(CustomerFactory.getName("cat").getName());
		System.out.println(CustomerFactory.getName("jhon3").getName());
	}
}
