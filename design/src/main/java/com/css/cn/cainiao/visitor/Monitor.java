package com.css.cn.cainiao.visitor;

public class Monitor implements ComputorPart {

	@Override
	public void visit(ComputorPartVisitor cpv) {
		cpv.visit(this);

	}

}
