package com.css.cn.cainiao.Strategy;

public class OpearationAdd implements Strategy {

	@Override
	public int doOperator(int x, int y) {
		return x+y;
	}

}
