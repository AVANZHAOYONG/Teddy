package com.css.cn.cainiao.factory.factories;

import com.css.cn.cainiao.factory.entity.color.SHColor;
import com.css.cn.cainiao.factory.entity.color.color;
import com.css.cn.cainiao.factory.entity.shape.SHShape;
import com.css.cn.cainiao.factory.entity.shape.shape;

public class ShangHaiFactory implements Provider {

	@Override
	public color getColor() {
		return new SHColor();
	}

	@Override
	public shape getShape() {
		return new SHShape();
	}

}
