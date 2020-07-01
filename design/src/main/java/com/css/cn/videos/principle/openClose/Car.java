package com.css.cn.videos.principle.openClose;

/**
 * 开闭原则 消极
 * @author 赵勇
 *
 */
public class Car {
	
	private double price;
	private String name ;
	
	public Car() {
		super();
	}

	
	
	public void setPrice(double price) {
		this.price = price * 0.8; //违反开闭原则
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	} 
	
	@Override
		public String toString() {
			return "商品"+name + "的价格为"+price;
		}
	
}
