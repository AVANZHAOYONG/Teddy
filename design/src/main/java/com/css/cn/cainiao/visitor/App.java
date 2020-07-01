package com.css.cn.cainiao.visitor;

public class App {
	public static void main(String[] args) {
		Computer computer = new Computer();
		ComputorPartVisitor visitor = new ComputerDisplayVisitor();
		computer.visit(visitor);
	}

}
