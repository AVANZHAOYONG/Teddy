package com.css.cn.cainiao.ChainResponsibility.entries;

public class InfoLogger extends AbsLogger {
	
	

	public InfoLogger() {
		this.level = AbsLogger.Info;
		DebugLogger debugLogger = new DebugLogger();
		this.setLogger(debugLogger);
		
	}

	@Override
	protected void write(String message) {
		System.out.println("InfoLogger| level: " + this.level +"| message: "+message);

	}

}
