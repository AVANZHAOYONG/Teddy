package com.css.cn.cainiao.visitor;

public class Computer implements ComputorPart {
	
	private ComputorPart[] cps ;
	public Computer() {
		cps = new ComputorPart[] {new Keyboard(),new Monitor(),new Mouse()};
	}

	@Override
	public void visit(ComputorPartVisitor cpv) {
		for (ComputorPart computorPart : cps) {
			computorPart.visit(cpv);
		}
		cpv.visit(this);
	}

}
