package com.css.cn.cainiao.visitor;

public interface ComputorPartVisitor {
	
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);

}
