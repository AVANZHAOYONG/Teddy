package com.css.cn.videos.dp.template;

public class FootGame extends Game {

	@Override
	public void beforePlay() {
		System.out.println("足球热身");
	}

	@Override
	public void afterPlay() {
		System.out.println("足球拉伸");

	}

	@Override
	public void play() {
		System.out.println("踢足球");

	}

}
