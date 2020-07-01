package com.css.cn.cainiao.InterceptingFilter;

public class DebugFilter implements FilterInter {

	@Override
	public void excute(String req) {
		System.out.println("debug:"+req);
	}

	
}
