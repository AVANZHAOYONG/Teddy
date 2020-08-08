package org.netty.com.server.stub.handler;

import java.lang.reflect.Method;
import java.util.Set;

import org.netty.com.common.info.ClassInfo;
import org.reflections.Reflections;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class InvokeHandler extends ChannelInboundHandlerAdapter {

	private String getImplClassName(ClassInfo classInfo) throws ClassNotFoundException {
		
		//服务方接口和实现类所在的包路径
		String classNamePath = classInfo.getClassName();
		Class superClass=Class.forName(classNamePath);
		Reflections reflections = new Reflections("com.css.sword.core.learn.netty_rpc.service");
		//得到某接口下的所有实现类
		Set<Class> ImplClassSet=reflections.getSubTypesOf(superClass);
		if(ImplClassSet.size()==0){
		System.out.println("未找到实现类"); return null;
		}else if(ImplClassSet.size()>1){
		System.out.println("找到多个实现类，未明确使用哪一个"); return null;
		}else {
		//把集合转换为数组
		Class[] classes=ImplClassSet.toArray(new Class[0]); return classes[0].getName(); //得到实现类的名字
		}
	}
	
	//读取客户端发来的数据并通过反射调用实现类的方法
	@Override 
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		ClassInfo info = (ClassInfo)msg;
		Object newInstance = Class.forName(getImplClassName(info)).newInstance();
		
		Method method = newInstance.getClass().getMethod(info.getMethodName(), info.getTypes());
		
		Object invoke = method.invoke(newInstance, info.getArgs());
		ctx.writeAndFlush(invoke);
	}
	
	
	
	
	
	
}
