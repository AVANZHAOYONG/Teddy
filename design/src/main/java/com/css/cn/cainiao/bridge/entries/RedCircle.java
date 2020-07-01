package com.css.cn.cainiao.bridge.entries;

public class RedCircle implements DrawApi {

	@Override
	public void drawCircle(int x, int y) {
		System.out.println("red,"+x+","+y);
	}

}
