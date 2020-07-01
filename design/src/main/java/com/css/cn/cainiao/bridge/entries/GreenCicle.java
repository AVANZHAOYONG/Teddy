package com.css.cn.cainiao.bridge.entries;

public class GreenCicle implements DrawApi {

	@Override
	public void drawCircle(int x, int y) {
		System.out.println("Green,"+x+","+y);
	}
	

}
