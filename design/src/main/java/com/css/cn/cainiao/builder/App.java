package com.css.cn.cainiao.builder;

import com.css.cn.cainiao.builder.entries.computer;

public class App {

	public static void main(String[] args) {
		//构造者  常用方法一（无指挥者，多用于 构造参数过多）；
		builder builder = MacBookBuilder.getBuilder();
		computer computer = builder.setName("赵勇的mac").setPrice(10000.09).setOs().build();
		System.out.println(computer);
	}
}
