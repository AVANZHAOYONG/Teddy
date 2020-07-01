package com.css.cn.videos.dp.adapter.demo2.entities;

public class UpperProgram extends absProgram {

	@Override
	public String process(Object str) {
		return ((String)str).toUpperCase();
	}

}
