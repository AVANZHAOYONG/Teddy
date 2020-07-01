package com.css.cn.videos.dp.factory.absfactory;

import org.css.com.dp.factory.absfactory.factory.Factory;
import org.css.com.dp.factory.absfactory.factory.impl.LevoneFactory;
import org.css.com.dp.factory.absfactory.product.mouse.Mouse;

public class App {
	public static void main(String[] args) {
		Factory factory = new LevoneFactory();
		
		Mouse mouse = factory.getMouse();
		mouse.move();
		System.exit(0);
	}

}
