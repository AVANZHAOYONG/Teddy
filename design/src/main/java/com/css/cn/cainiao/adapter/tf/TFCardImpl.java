package com.css.cn.cainiao.adapter.tf;

public class TFCardImpl implements TFCard {

	private String text ;
	
	@Override
	public String read() {
		return text;
	}

	@Override
	public void write(String data) {
		this.text = "TF"+ data;
	}

}
