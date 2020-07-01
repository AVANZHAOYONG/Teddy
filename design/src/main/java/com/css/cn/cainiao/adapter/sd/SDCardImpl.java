package com.css.cn.cainiao.adapter.sd;

public class SDCardImpl implements SDCard {

	private String text ;
	@Override
	public String read() {
		return text;
	}

	@Override
	public void write(String data) {
		this.text = "SD:" + data;
	}

}
