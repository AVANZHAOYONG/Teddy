package org.phase.one.learn20200126;

public class App {
	
//	
//	public static void main(String[] args) {
//		int times = 5;
//		Runnable zi = new MyThread(times);
//		new Thread(zi, "zhaoyong").start();
//		printee(times);
//		System.exit(0);
//	}
//
//	private static void printee(int times) {
//		for (int i = 0; i < times; i++) {
//			System.out.println(Thread.currentThread().getName()+i);
//		}
//	}
	
	
	public static void main(String[] args) {
		Runnable run = new Tickets(300);
		new Thread(run, "窗口一").start();
		new Thread(run, "窗口二").start();
		new Thread(run, "窗口三").start();
		System.out.println("wancheng");
		System.out.println("fdas");
	}

}
