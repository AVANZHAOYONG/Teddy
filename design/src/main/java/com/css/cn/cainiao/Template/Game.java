package com.css.cn.cainiao.Template;

public interface Game {
	
	void start();
	void doGame();
	void end();
	
	default void play() {
		start();
		doGame();
		end();
	}

}
