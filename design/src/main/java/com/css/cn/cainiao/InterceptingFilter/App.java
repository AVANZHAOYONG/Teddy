package com.css.cn.cainiao.InterceptingFilter;

public class App {

	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.addFilter(new DebugFilter());
		filterManager.addFilter(new AuthenticationFilter());
		Client client = new Client();
		
		client.setFileterManager(filterManager);
		client.sendRequest("hellofdsa");
	}
}
