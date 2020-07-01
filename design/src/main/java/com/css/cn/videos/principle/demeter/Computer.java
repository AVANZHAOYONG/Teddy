package com.css.cn.videos.principle.demeter;

public class Computer {
	
	public void closeProgram() {
		System.out.println("关闭程序");
	}
	public void quiteSystem() {
		System.out.println("退出系统");
	}
	public void killProgram() {
		System.out.println("杀死进程");
	}
	
	public void shutdown() {
		closeProgram();
		killProgram();
		quiteSystem();
	}

}
