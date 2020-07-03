package org.netty.com.common.info;

import java.io.Serializable;
/**
 * rpc调用 信息类
 * @author 赵勇
 *
 */
public class ClassInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String className ;//类名
	private String methodName ; //方法名
	private Class<?>[] types ; //参数类型列表
	private Object[] args ; //参数列表
	private Object response; //返回值
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public Class<?>[] getTypes() {
		return types;
	}
	public void setTypes(Class<?>[] types) {
		this.types = types;
	}
	public Object[] getArgs() {
		return args;
	}
	public void setArgs(Object[] args) {
		this.args = args;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
}
