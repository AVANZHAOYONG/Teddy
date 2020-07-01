package com.css.cn.videos.dp.factory.absfactory.factory.impl;

import org.css.com.dp.factory.absfactory.factory.Factory;
import org.css.com.dp.factory.absfactory.product.keyboard.Keyboard;
import org.css.com.dp.factory.absfactory.product.keyboard.impl.AppleKeyboard;
import org.css.com.dp.factory.absfactory.product.mouse.Mouse;
import org.css.com.dp.factory.absfactory.product.mouse.impl.AppleMouse;

public class AppleFactory implements Factory {

	@Override
	public Keyboard getKeyBoard() {
		return new AppleKeyboard();
	}

	@Override
	public Mouse getMouse() {
		return new AppleMouse();
	}

}
