package com.css.cn.videos.dp.decorator;

import com.css.cn.videos.dp.decorator.component.Component;
import com.css.cn.videos.dp.decorator.component.impl.MyComponent;
import com.css.cn.videos.dp.decorator.decorator.Decorator;
import com.css.cn.videos.dp.decorator.decorator.impl.MyDecorator;

/**
 * jdk的 inputstream和bufferedInputstream也是用的装饰器
 * @author wyx11
 *
 */
public class App {

	public static void main(String[] args) {
		Component component = new MyComponent();
		Decorator decorator = new MyDecorator(component);
		double cost = decorator.cost();
		System.out.println(cost);
	}
}
