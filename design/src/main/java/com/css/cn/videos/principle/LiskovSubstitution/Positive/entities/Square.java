package com.css.cn.videos.principle.LiskovSubstitution.Positive.entities;

public class Square implements Shape {

	private double sideLength ; 
	
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public Double getArea() {
		return sideLength * sideLength;
	}

}
