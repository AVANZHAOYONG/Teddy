package com.css.sword.learn.eventbus.event;

public class EtcdChangeEvent implements Event {
	
	private String message ;
	
	public void setMessage(String message) {
		this.message = message ; 
	}
	
	public String getMessage() {
		return this.message ; 
	}

}
