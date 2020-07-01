package com.css.cn.videos.dp.factory.absfactory.factory.impl;

import org.css.com.dp.factory.absfactory.factory.Factory;
import org.css.com.dp.factory.absfactory.product.keyboard.Keyboard;
import org.css.com.dp.factory.absfactory.product.keyboard.impl.LevoneKeyboard;
import org.css.com.dp.factory.absfactory.product.mouse.Mouse;
import org.css.com.dp.factory.absfactory.product.mouse.impl.LevoneMouse;

public class LevoneFactory implements Factory {

	@Override
	public Keyboard getKeyBoard() {
		return new LevoneKeyboard();
	}

	@Override
	public Mouse getMouse() {
		return new LevoneMouse();
	}

}
