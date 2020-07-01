package com.css.cn.cainiao.ChainResponsibility.entries;

public class DebugLogger extends AbsLogger {
	
	

	public DebugLogger() {
		this.level = AbsLogger.Debug;
		this.setLogger(null);
	}

	@Override
	protected void write(String message) {
		System.out.println("DebugLogger| level: " + this.level +"| message: "+message);
		
	}

}
