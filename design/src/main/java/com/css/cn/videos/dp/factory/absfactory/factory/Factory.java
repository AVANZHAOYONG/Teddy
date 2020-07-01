package com.css.cn.videos.dp.factory.absfactory.factory;

import org.css.com.dp.factory.absfactory.product.keyboard.Keyboard;
import org.css.com.dp.factory.absfactory.product.mouse.Mouse;

public interface Factory {
	
	Keyboard getKeyBoard();
	
	Mouse getMouse();

}
