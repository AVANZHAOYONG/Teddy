package com.css.cn.cainiao.flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

import com.css.cn.flyweight.entries.Circle;
import com.css.cn.flyweight.entries.Shape;


public class ShapeFactory {
	private static final Map<String , Shape> circles = new HashMap<String, Shape>();
	
	public static Shape getCircle(String key) {
		Shape shape = circles.get(key);
		if(shape == null) {
			shape = new Circle();
			circles.put(key, shape);
		}
		return shape;
	}
	
}
