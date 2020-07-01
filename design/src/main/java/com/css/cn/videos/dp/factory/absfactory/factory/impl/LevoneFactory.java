package com.css.cn.videos.dp.factory.absfactory.factory.impl;

import com.css.cn.videos.dp.factory.absfactory.factory.Factory;
import com.css.cn.videos.dp.factory.absfactory.product.keyboard.Keyboard;
import com.css.cn.videos.dp.factory.absfactory.product.keyboard.impl.LevoneKeyboard;
import com.css.cn.videos.dp.factory.absfactory.product.mouse.Mouse;
import com.css.cn.videos.dp.factory.absfactory.product.mouse.impl.LevoneMouse;

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
