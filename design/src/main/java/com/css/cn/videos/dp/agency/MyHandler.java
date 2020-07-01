package com.css.cn.videos.dp.agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyHandler implements InvocationHandler {
	
	private Object target;
	

	public MyHandler(Object target) {
		super();
		this.target = target;
	}

	private void before(String methodName, Object[] args) {
		System.out.println("方法：" + methodName + "，执行参数为：" + Arrays.toString(args));
	}
	
	private void after(String methodName, Object result) {
		System.out.println("方法：" + methodName + "，执行结果为：" + result);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName  = method.getName();
		before(methodName ,args);
		
		Object result = method.invoke(target, args);
		
		after(methodName, result);
		
		return result;
	}

}
