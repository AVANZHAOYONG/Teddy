package com.css.cn.videos.dp.template;

public class BaseBallGame extends Game {

	@Override
	public void beforePlay() {
		System.out.println("篮球热身");
		
	}

	@Override
	public void afterPlay() {
		System.out.println("篮球拉伸");
		
	}

	@Override
	public void play() {
		System.out.println("打篮球");
		
	}

}
