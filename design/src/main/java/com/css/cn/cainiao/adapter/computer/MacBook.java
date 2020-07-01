package com.css.cn.cainiao.adapter.computer;

import com.css.cn.cainiao.adapter.sd.SDCard;

public class MacBook implements Computer {

	
	@Override
	public String getName() {
		return null;
	}

	@Override
	public void writeToSD(SDCard data,String text) {
		data.write(text);
	}
	
	@Override
	public String readFromSD(SDCard data) {
		return data.read();
	}

}
