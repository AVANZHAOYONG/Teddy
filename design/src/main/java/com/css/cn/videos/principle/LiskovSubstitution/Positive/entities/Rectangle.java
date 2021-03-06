package com.css.cn.videos.principle.LiskovSubstitution.Positive.entities;


public class Rectangle implements Shape {
	
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
	@Override
	public Double getArea() {
		return width * length;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
}
