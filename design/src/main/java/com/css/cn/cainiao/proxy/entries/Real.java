package com.css.cn.cainiao.proxy.entries;

public class Real implements Inter {
	
	private String fileName;
	

	public Real(String fileName) {
		super();
		this.fileName = fileName;
	}


	@Override
	public void display() {
		System.out.println("显示图片：" + this.fileName);
	}

}
