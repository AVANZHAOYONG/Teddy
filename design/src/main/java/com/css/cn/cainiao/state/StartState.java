package com.css.cn.cainiao.state;

public class StartState implements State {

	@Override
	public void start(Context context) {
		
	}

	@Override
	public void close(Context context) {
		context.setState(new StopState());
		System.out.println("start state");
		
	}

}
