package com.css.cn.videos.dp.factory.absfactory;

import com.css.cn.videos.dp.factory.absfactory.factory.Factory;
import com.css.cn.videos.dp.factory.absfactory.factory.impl.LevoneFactory;
import com.css.cn.videos.dp.factory.absfactory.product.mouse.Mouse;

public class App {
	public static void main(String[] args) {
		Factory factory = new LevoneFactory();
		
		Mouse mouse = factory.getMouse();
		mouse.move();
		System.exit(0);
	}

}
