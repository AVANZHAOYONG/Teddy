package com.css.cn.cainiao.factory;

import com.css.cn.cainiao.factory.entity.shape.shape;
import com.css.cn.cainiao.factory.factories.GetFactory;
import com.css.cn.cainiao.factory.factories.Provider;

public class App {
	public static void main(String[] args) {
		Provider provider = GetFactory.GetFactory("sh");
		shape shape = provider.getShape();
		shape.MyShape();
	}

}
