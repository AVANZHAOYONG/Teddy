package com.css.cn.videos.principle.LiskovSubstitution.Positive;

import com.css.cn.videos.principle.LiskovSubstitution.Positive.entities.Rectangle;

/**
 * 里氏替换 
 *   is a
 *   是否业务场景符合
 * @author 赵勇
 *
 */
public class Positive {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(100);
		rectangle.setWidth(90);
		LiskovUtils.change(rectangle);
		
	}

}
