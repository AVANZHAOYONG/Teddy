package com.css.cn.cainiao.proxy.entries;

public class ProxyReal implements Inter {
	private String fileName;
	private Real real;
	
	

	public ProxyReal(String fileName) {
		super();
		this.fileName = fileName;
	}



	@Override
	public void display() {
		if(real==null) {
			real = new Real(fileName);
		}
		real.display();
	}

}
