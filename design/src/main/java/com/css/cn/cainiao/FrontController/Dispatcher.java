package com.css.cn.cainiao.FrontController;

public class Dispatcher {
	private HomeView hv;
	private StudentView sv;
	public Dispatcher() {
		super();
		this.hv = new HomeView();
		this.sv = new StudentView();
	}
	
	
	public void dispatch(String request) {
		if("student".equalsIgnoreCase(request)) {
			sv.show();
		}else {
			hv.show();
		}
	}
	
	

}
