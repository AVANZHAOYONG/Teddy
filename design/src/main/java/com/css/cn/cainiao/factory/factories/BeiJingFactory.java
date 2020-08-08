package com.css.cn.cainiao.factory.factories;

import com.css.cn.cainiao.factory.entity.color.BJColor;
import com.css.cn.cainiao.factory.entity.color.color;
import com.css.cn.cainiao.factory.entity.shape.BJShape;
import com.css.cn.cainiao.factory.entity.shape.shape;

public class BeiJingFactory implements Provider {

	@Override
	public color getColor() {
		return new BJColor();
	}

	@Override
	public shape getShape() {
		return new BJShape();
	}

}
