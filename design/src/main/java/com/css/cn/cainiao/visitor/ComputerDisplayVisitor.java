package com.css.cn.cainiao.visitor;

public class ComputerDisplayVisitor implements ComputorPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("dp computer");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("dp mouse");
		
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("dp keyboard");
		
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("dp monitor");
		
	}

}
