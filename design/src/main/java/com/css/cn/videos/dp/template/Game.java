package com.css.cn.videos.dp.template;

public abstract class Game {

	public abstract void beforePlay();

	public abstract void afterPlay();
	
	public abstract void play();
	
	public void doPlay() {
		
		beforePlay();
		
		play();
		
		afterPlay();

	}
}
