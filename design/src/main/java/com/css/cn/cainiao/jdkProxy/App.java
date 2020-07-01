package com.css.cn.cainiao.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.css.cn.jdkProxy.entries.Operate;
import com.css.cn.jdkProxy.entries.RealOperate;
import com.css.cn.jdkProxy.proxy.MyInvocationHandler;

public class App {
	public static void main(String[] args) {
		Operate operate = new RealOperate();
		InvocationHandler handler = new MyInvocationHandler(operate);
		Operate proxyInstance = (Operate)Proxy.newProxyInstance(	ClassLoader.getSystemClassLoader(), new Class[] {Operate.class},handler);
		String call = proxyInstance.payNewYearCall();
		Date date = proxyInstance.getDate();
		String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
		System.out.println(format+","+call);
	}

}
