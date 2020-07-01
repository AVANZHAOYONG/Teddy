package com.css.cn.cainiao.prototype.user;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.css.cn.cainiao.prototype.entries.Color;
import com.css.cn.cainiao.prototype.entries.Red;

public class ColorCache {
	
	private static Map<String , Color> colors = new ConcurrentHashMap<String, Color>();

	public static Color getColor(String key) throws CloneNotSupportedException {
		return (Color) colors.get(key).clone();
	}
	
	public static void init() {
		//如果此时创建对象消耗很大
		Red red = new Red();
		System.out.println(red);
		colors.put("red", red);
	}
}
