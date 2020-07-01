package com.css.cn.cainiao.InterceptingFilter;

public class Client {
	private FilterManager filterManager;
	
	public void setFileterManager(FilterManager fileterManager) {
		this.filterManager = fileterManager;
	}
	
	public void sendRequest(String req) {
		filterManager.execute(req);
	}

}
