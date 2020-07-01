package com.css.cn.cainiao.ChainResponsibility.entries;

public abstract class AbsLogger {

	public static int Error = 3;
	public static int Info = 2;
	public static int Debug = 1;
	
	protected int level;
	
	protected AbsLogger nextLogger;
	
	public void setLogger(AbsLogger nextLog) {
		this.nextLogger = nextLog;
	}
	
	public void logMessage(int level, String message) {
		if(this.level <= level) {
			write(message);
		}
		if(this.nextLogger!=null) {
			this.nextLogger.logMessage(level, message);
		}
	}

	protected abstract void write(String message);
}
