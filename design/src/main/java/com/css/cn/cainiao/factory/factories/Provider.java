package com.css.cn.cainiao.factory.factories;

import com.css.cn.cainiao.factory.entity.color.color;
import com.css.cn.cainiao.factory.entity.shape.shape;

public interface Provider {

	//抽象工厂模式获取 color shape
	color getColor();
	shape getShape();
}
