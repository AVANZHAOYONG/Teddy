package com.css.cn.cainiao.Interpreter.entries;

public class OrExpression implements Expression {
	
	private Expression e1 ;
	private Expression e2 ;

	public OrExpression(Expression e1, Expression e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public boolean interpret(String context) {
		return e1.interpret(context) || e2.interpret(context);
	}

}
