package com.css.cn.cainiao.flyweight;

import com.css.cn.cainiao.flyweight.entries.Shape;
import com.css.cn.cainiao.flyweight.flyweight.ShapeFactory;

public class App {
	
	public static void main(String[] args) {
		Shape circle = ShapeFactory.getCircle("mytest");
		System.out.println(circle);
		Shape circle1 = ShapeFactory.getCircle("mytest");
		System.out.println(circle1);
		Shape circle2 = ShapeFactory.getCircle("mytest");
		System.out.println(circle2);
		
		
		
	}

}
