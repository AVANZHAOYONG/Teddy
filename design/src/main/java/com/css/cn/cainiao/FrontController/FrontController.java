package com.css.cn.cainiao.FrontController;

public class FrontController {
	private Dispatcher dispatcher;
	
	public FrontController(){
		dispatcher = new Dispatcher(); 
	}
	
	private boolean isAuthenticUser() {
		System.out.println("do authentic");
		return true;
	}
	
	private void trackRequest(String req) {
		System.out.println("do track");
	}
	
	public void dispatchRequest(String req) {
		trackRequest(req);
		if(isAuthenticUser()) {
			dispatcher.dispatch(req);
		}
	}

}
