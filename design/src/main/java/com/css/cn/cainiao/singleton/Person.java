package com.css.cn.cainiao.singleton;

public class Person {
	
	private static Person instance ;
	private  Person() {
	}

	public static Person getInstance() {
		if(instance==null) {
			synchronized(Person.class) {
				if(instance==null) {
					instance = new Person();
				}
			}
		}
		return instance;
	}
}
