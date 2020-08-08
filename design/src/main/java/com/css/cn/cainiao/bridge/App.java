package com.css.cn.cainiao.bridge;

import com.css.cn.cainiao.bridge.entries.GreenCicle;
import com.css.cn.cainiao.bridge.inter.Circle;

public class App {

	public static void main(String[] args) {
		Circle circle = new Circle(new GreenCicle(), 10, 20);
		
		circle.draw();
	}
}
