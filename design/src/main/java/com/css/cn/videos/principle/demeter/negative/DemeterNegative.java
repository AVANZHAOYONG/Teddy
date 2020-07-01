package com.css.cn.videos.principle.demeter.negative;

import com.css.cn.videos.principle.demeter.Computer;

public class DemeterNegative {
	
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.closeProgram();
		computer.killProgram();
		computer.shutdown();
	}
	

}