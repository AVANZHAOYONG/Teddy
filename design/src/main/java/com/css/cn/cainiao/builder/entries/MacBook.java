package com.css.cn.cainiao.builder.entries;

public class MacBook implements computer {
	private String name ; 
	private double price;
	private String os;
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
		
	}
	@Override
	public void setOs() {
		this.os = "ios 13";
	}
	
	@Override
	public String toString() {
		return "name:" + name +
				",price:" + price +
				",os: " + os; 
	}

}
