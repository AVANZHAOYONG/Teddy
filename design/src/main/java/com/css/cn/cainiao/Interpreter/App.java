package com.css.cn.cainiao.Interpreter;

import com.css.cn.Interpreter.entries.AndExpression;
import com.css.cn.Interpreter.entries.Expression;
import com.css.cn.Interpreter.entries.OrExpression;
import com.css.cn.Interpreter.entries.TerExpression;

public class App {
	
	public static Expression getMaleExpression() {
		Expression jhonExpression = new TerExpression("jhon");
		Expression mikeExpression = new TerExpression("mike");
		
		return new OrExpression(jhonExpression, mikeExpression);
	}

	public static Expression getMarriedWomenExpression() {
		Expression expression = new TerExpression("Marry");
		Expression mdied = new TerExpression("died");
		
		return new AndExpression(expression, mdied);
	}
	
	public static void main(String[] args) {
		Expression expression = getMaleExpression();
		boolean interpret = expression.interpret("jhon");
		System.out.println(interpret);
		Expression marriedWomenExpression = getMarriedWomenExpression();
		boolean b = marriedWomenExpression.interpret("Marry died");
		System.out.println(b);
	}
}
