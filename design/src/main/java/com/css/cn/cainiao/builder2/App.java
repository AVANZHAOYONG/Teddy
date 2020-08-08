package com.css.cn.cainiao.builder2;

import com.css.cn.cainiao.builder2.builder.BTBuilder;
import com.css.cn.cainiao.builder2.builder.builder;
import com.css.cn.cainiao.builder2.conductor.Director;
import com.css.cn.cainiao.builder2.entries.Car;

public class App {
	public static void main(String[] args) {
		builder builder = new BTBuilder();//创建一个本田构造者
		Director director = new Director(builder);//指挥者
		Car construct = director.construct(); //指挥构造
		System.out.println(construct); //使用商品
	}

}
