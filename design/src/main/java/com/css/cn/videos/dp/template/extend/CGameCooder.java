package com.css.cn.videos.dp.template.extend;

public class CGameCooder {
	
	public void doPlay(CGame game) {
		game.before();
		game.play();
		game.after();
	}

}
