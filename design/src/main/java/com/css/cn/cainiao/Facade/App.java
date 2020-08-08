package com.css.cn.cainiao.Facade;

import com.css.cn.cainiao.Facade.facade.Computer;

public class App {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer.start();
		computer.shutdown();
	}

}
