package com.css.cn.cainiao.Strategy;

public class Context {
	
	private Strategy stra;
	
	public void setStrategy(Strategy stra) {
		this.stra = stra;
	}
	
	public int excute(int x, int y) {
		return stra.doOperator(x, y);
	}

}
