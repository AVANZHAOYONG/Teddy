package com.css.cn.cainiao.Strategy;

public class OpearationMulti implements Strategy {

	@Override
	public int doOperator(int x, int y) {
		return x*y;
	}

}
