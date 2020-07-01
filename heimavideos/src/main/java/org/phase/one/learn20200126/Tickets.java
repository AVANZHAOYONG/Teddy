package org.phase.one.learn20200126;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets implements Runnable {
	
	private int tickets ;
	
	private Lock lock = new ReentrantLock();

	public Tickets(int tickets) {
		super();
		this.tickets = tickets;
	}

	@Override
	public void run() {
		while (tickets>0) {
			lock.lock();
			try {
				if(!(tickets>0))break;
				Thread.sleep(10);
				System.out.println(Thread.currentThread().getName()+"出售"+tickets--+"票");
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
		}
	}

	
}
