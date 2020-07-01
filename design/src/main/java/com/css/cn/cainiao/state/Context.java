package com.css.cn.cainiao.state;

public class Context {

	private State state;
	
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void start() {
		getState().start(this);
	}
	public void close() {
		getState().close(this);
	}
}
