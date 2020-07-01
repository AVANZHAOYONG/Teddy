package com.css.cn.videos.dp.factory.simpleFactory.negative;

import org.css.com.dp.factory.simpleFactory.entities.Apple;
import org.css.com.dp.factory.simpleFactory.entities.Food;
import org.css.com.dp.factory.simpleFactory.entities.Pear;

public class Negative {
	
	/**
	 * 使用者依赖 作者的代码 未实现解耦  作者代码已经提供香蕉  我们这里就需要修改 不符合依赖倒置
	 * @param args
	 */
	public static void main(String[] args) {
		Food apple = new Apple();
		apple.eat();
		Food pear = new Pear();
		pear.eat();
	}

}
