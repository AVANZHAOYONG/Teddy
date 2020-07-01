package com.css.cn.cainiao.bridge.inter;

import com.css.cn.bridge.entries.DrawApi;

public class Circle implements Shape {
	private DrawApi draw ;
	private int x , y;

	public Circle(DrawApi draw, int x , int y) {
		super();
		this.draw = draw;
		this.x = x ;
		this.y = y ;
 	}


	@Override
	public void draw() {
		draw.drawCircle(x, y);
	}

}
