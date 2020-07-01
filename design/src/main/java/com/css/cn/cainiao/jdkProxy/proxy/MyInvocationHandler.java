package com.css.cn.cainiao.jdkProxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

import com.css.cn.cainiao.jdkProxy.entries.Operate;

public class MyInvocationHandler implements InvocationHandler {
	
	private Operate operate;
	
	

	public MyInvocationHandler(Operate operate) {
		super();
		this.operate = operate;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if("getDate".equals(method.getName())) {
			Date date = (Date)method.invoke(operate, args);
			return date;
		}else {
			String call = (String)method.invoke(operate, args);
			return call;
		}
	}

}
