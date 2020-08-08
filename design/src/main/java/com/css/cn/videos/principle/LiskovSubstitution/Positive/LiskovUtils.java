package com.css.cn.videos.principle.LiskovSubstitution.Positive;

import com.css.cn.videos.principle.LiskovSubstitution.Positive.entities.Rectangle;

public class LiskovUtils {
	
	public static void change(Rectangle rec) {
		while(rec.getLength() >= rec.getWidth()) {
			rec.setWidth(rec.getWidth() + 1);
			System.out.println(rec.toString());
		}
		return ;
	}

}
