package com.css.cn.videos.dp.adapter.demo1;

public class App {

	public static void main(String[] args) {
		Calc calc = new Calc();
		int result = calc.add(10, 47);
		System.out.println(result);
		
		//此时我们想计算三个数的和
		
		CalcAdapter calcAdapter = new CalcAdapter(calc);
		int resultAdapter = calcAdapter.add(1, 2, 3);
		System.out.println(resultAdapter);
		
	}
}
