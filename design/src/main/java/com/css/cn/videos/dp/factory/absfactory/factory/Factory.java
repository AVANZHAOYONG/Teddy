package com.css.cn.videos.dp.factory.absfactory.factory;

import com.css.cn.videos.dp.factory.absfactory.product.keyboard.Keyboard;
import com.css.cn.videos.dp.factory.absfactory.product.mouse.Mouse;

public interface Factory {
	
	Keyboard getKeyBoard();
	
	Mouse getMouse();

}
