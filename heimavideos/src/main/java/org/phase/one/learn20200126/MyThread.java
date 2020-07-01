package org.phase.one.learn20200126;

public class MyThread implements Runnable{
	
	private int times;
	

	public MyThread(int times) {
		super();
		this.times = times;
	}


	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
