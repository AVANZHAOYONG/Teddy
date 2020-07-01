package com.css.cn.videos.principle.LiskovSubstitution.Negative.entities;

public class Square extends Rectangle {

	private double sideLength ; 
	
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	

	@Override
	public double getLength() {
		return sideLength;
	}

	@Override
	public void setLength(double length) {
		this.sideLength = length;
	}

	@Override
	public double getWidth() {
		return sideLength;
	}

	@Override
	public void setWidth(double width) {
		this.sideLength = width;
	}

	@Override
	public Double getArea() {
		return sideLength * sideLength;
	}

	@Override
	public String toString() {
		return "Square [sideLength=" + sideLength + "]";
	}



	
}
