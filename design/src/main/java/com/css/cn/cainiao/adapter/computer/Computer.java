package com.css.cn.cainiao.adapter.computer;

import com.css.cn.adapter.sd.SDCard;

public interface Computer {

	public String getName();
	
	void writeToSD(SDCard data, String text);

	String readFromSD(SDCard data);
}
