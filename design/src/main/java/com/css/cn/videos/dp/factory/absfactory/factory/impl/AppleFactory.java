package com.css.cn.videos.dp.factory.absfactory.factory.impl;

import com.css.cn.videos.dp.factory.absfactory.factory.Factory;
import com.css.cn.videos.dp.factory.absfactory.product.keyboard.Keyboard;
import com.css.cn.videos.dp.factory.absfactory.product.keyboard.impl.AppleKeyboard;
import com.css.cn.videos.dp.factory.absfactory.product.mouse.Mouse;
import com.css.cn.videos.dp.factory.absfactory.product.mouse.impl.AppleMouse;

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
