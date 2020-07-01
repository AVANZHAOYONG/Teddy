package com.css.cn.cainiao.prototype;

import com.css.cn.cainiao.prototype.entries.Color;
import com.css.cn.cainiao.prototype.user.ColorCache;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		ColorCache.init();
		
		Color color = ColorCache.getColor("red");
		System.out.println(color);
	}

}
