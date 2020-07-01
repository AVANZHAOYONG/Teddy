package com.css.cn.videos.principle.LiskovSubstitution.Negative;

import org.css.com.principle.LiskovSubstitution.Negative.entities.Rectangle;
import org.css.com.principle.LiskovSubstitution.Negative.entities.Square;

public class Negative {
	
	public static void main(String[] args) {
//		rectangle();
		square();
	}

	private static void rectangle() {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(20);
		rectangle.setWidth(18);
		LiskovUtils.change(rectangle);
	}

	private static void square() {
		Square square = new Square();
		
		square.setSideLength(20);
		LiskovUtils.change(square);
	}

}
