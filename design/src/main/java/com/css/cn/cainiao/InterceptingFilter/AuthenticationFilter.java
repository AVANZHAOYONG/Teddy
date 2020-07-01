package com.css.cn.cainiao.InterceptingFilter;

public class AuthenticationFilter implements FilterInter {

	@Override
	public void excute(String req) {
		
		System.out.println("Authentication : " + req);
	}

}
