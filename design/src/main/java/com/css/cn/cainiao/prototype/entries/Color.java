package com.css.cn.cainiao.prototype.entries;

public abstract class Color implements Cloneable{
	
	protected String context ; 

	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return  super.clone();
	}
	
	public abstract void setContext();
	
	public String getContext() {
		return context;
	}
}
