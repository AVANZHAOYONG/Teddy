package com.css.cn.cainiao.ChainResponsibility.entries;

public class ErrorLogger extends AbsLogger {
	
	

	public ErrorLogger() {
		this.level = AbsLogger.Error;
		InfoLogger infoLogger = new InfoLogger();
		this.setLogger(infoLogger);
	}

	@Override
	protected void write(String message) {
		System.out.println("ErrorLogger| level: " + this.level +"| message: "+message);

	}

}
