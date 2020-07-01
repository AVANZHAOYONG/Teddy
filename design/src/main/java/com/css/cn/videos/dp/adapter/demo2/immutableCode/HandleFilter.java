package com.css.cn.videos.dp.adapter.demo2.immutableCode;

public class HandleFilter implements Filter {

	@Override
	public Object handle(Object obj) {
		return obj; //意思一下
	}

	@Override
	public String getTile() {
		return "Old code!";
	}

}
