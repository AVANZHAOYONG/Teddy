package com.css.cn.cainiao.decorator.decorate;

import com.css.cn.decorator.entries.Shape;

public class RedShepeDecorator implements ShapeDecorator {

	private Shape shape;
	
	
	public RedShepeDecorator(Shape shape) {
		super();
		this.shape = shape;
	}


	@Override
	public String draw() {
		
		return shape.draw()+" red";
	}

}
