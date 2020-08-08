package com.css.cn.videos.dp.builder;

import com.css.cn.videos.dp.builder.builder.impl.GameCoputerBuilder;
import com.css.cn.videos.dp.builder.product.Computer;

public class App {
	
	public static void main(String[] args) {
		Computer build = new GameCoputerBuilder().setCpu("a").setGpu("b").setMem("c").build();
		System.out.println(build);
		Computer build2 = new GameCoputerBuilder().build();
		System.out.println(build2);
	}

}
