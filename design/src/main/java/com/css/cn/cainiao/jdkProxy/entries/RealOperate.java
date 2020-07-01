package com.css.cn.cainiao.jdkProxy.entries;

import java.util.Date;

public class RealOperate implements Operate {

	@Override
	public Date getDate() {
		return new Date();
	}

	@Override
	public String payNewYearCall() {
		return "Happy New Year!";
	}

}
