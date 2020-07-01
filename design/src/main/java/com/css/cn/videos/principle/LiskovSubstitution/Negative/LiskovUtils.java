package com.css.cn.videos.principle.LiskovSubstitution.Negative;

import org.css.com.principle.LiskovSubstitution.Negative.entities.Rectangle;

public class LiskovUtils {
	
	public static void change(Rectangle rec) {
		while(rec.getLength() >= rec.getWidth()) {
			rec.setWidth(rec.getWidth() + 1);
			System.out.println(rec.toString());
		}
		return ;
	}

}
