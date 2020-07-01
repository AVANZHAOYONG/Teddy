package com.css.cn.cainiao.ChainResponsibility;

import com.css.cn.cainiao.ChainResponsibility.entries.AbsLogger;
import com.css.cn.cainiao.ChainResponsibility.entries.ErrorLogger;

public class App {
	public static void main(String[] args) {
		AbsLogger logger = new ErrorLogger();
		
		logger.logMessage(AbsLogger.Error, "我是Error");
		
		logger.logMessage(AbsLogger.Info, "我是Info");
		logger.logMessage(AbsLogger.Debug, "我是Debug");
	}

}
