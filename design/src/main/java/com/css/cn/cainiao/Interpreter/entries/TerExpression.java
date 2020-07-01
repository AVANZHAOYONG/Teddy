package com.css.cn.cainiao.Interpreter.entries;

public class TerExpression implements Expression {
	
	private String data ; 
	
	

	public TerExpression(String data) {
		super();
		this.data = data;
	}



	@Override
	public boolean interpret(String context) {
		return context.contains(data);
	}

}
