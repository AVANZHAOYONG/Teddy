    package com.css.cn.cainiao.decorator;

import com.css.cn.cainiao.decorator.decorate.RedShepeDecorator;
import com.css.cn.cainiao.decorator.decorate.ShapeDecorator;
import com.css.cn.cainiao.decorator.entries.Circle;
import com.css.cn.cainiao.decorator.entries.Rectangle;
import com.css.cn.cainiao.decorator.entries.Shape;

public class App {
	public static void main(String[] args) {
		Shape circle = new Circle();
		String draw = circle.draw();
		System.out.println("raw :" + draw);
		
		ShapeDecorator decorator = new RedShepeDecorator(new Rectangle());
		
		String draw2 = decorator.draw();
		System.out.println("decorator:"+draw2);
		
	}

}
