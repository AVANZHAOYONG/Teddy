package com.css.cn.cainiao.cglibProxy.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	
	private Object target;
	
	

	public CglibProxy(Object target) {
		super();
		this.target = target;
	}



	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		Object invoke = method.invoke(target, args);
		return invoke;
	}
	
	public static Object getProxy(Object target) {
		Enhancer enhancer = new Enhancer();
		
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(new CglibProxy(target));
		return enhancer.create();
	}

}
