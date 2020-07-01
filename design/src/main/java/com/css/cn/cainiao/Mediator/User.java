package com.css.cn.cainiao.Mediator;

public class User {
	
	private String name ; 
	
	public User(String name) {
		super();
		this.name = name;
	}

	public void sendMsg(String message) {
		ChartRoom.getMessage(this,message);
	}

	public String getName() {
		return name;
	}

}
