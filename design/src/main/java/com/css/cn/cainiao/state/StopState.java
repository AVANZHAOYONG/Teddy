package com.css.cn.cainiao.state;

public class StopState implements State {

	@Override
	public void start(Context context) {
		context.setState(new StopState());
		System.out.println("stop state");
	}

	@Override
	public void close(Context context) {
		
	}

}
