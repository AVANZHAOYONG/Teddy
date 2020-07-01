package com.css.cn.cainiao.flyweight.entries;

public class Circle implements Shape {
	private int radius ;
	private String color;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("radius:"+radius+",color:"+color);
	}

}
