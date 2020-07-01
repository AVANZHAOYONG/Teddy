package com.css.cn.videos.principle.demeter.positive;

import com.css.cn.videos.principle.demeter.Computer;
/**
 * 迪米特法则  最少知道原则
 * 
 * 只对朋友通讯
 * 
 * @author 赵勇
 *
 */
public class DemeterPositive {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.shutdown();
	}

}
