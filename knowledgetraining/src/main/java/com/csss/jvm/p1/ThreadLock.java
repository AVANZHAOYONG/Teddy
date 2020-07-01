package com.csss.jvm.p1;

public class ThreadLock {
	
	private static Object obj1 = new Object();
	private static Object obj2 = new Object();
	
	public static void main(String[] args) {
		new Thread(new thread1()).start();
		new Thread(new thread2()).start();
		
	}

	private static class thread1 implements Runnable{

		@Override
		public void run() {
			
			synchronized (obj1) {
			
				try {
					Thread.sleep(2000);
					System.out.println("thread1休眠结束");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (obj2) {
					System.out.println("thread1获取obj2");
				}
			}
			
		}
		
	}
	
	private static class thread2 implements Runnable{

		@Override
		public void run() {
			
			synchronized (obj2) {
			
				try {
					Thread.sleep(2000);
					System.out.println("thread2休眠结束");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (obj1) {
					System.out.println("thread2获取obj1");
				}
			}
			
		}
		
	}
	
}
