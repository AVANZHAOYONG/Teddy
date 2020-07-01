package com.css.cn.videos.dp.adapter.demo1;

/**
 * 组合优于继承 所以我们 使用 组合
 * @author 赵勇
 *
 */
public class CalcAdapter {
	private Calc calc ;

	public CalcAdapter(Calc calc) {
		super();
		this.calc = calc;
	}
	
	public int add(int a, int b, int c) {
		return calc.add(calc.add(a, b), c);
	}
	
	

}
