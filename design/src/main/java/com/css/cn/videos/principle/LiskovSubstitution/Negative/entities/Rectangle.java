package com.css.cn.videos.principle.LiskovSubstitution.Negative.entities;


public class Rectangle {
	
	private double length ; 
	private double width ;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public Double getArea() {
		return width * length;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
}
