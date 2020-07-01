package org.phase.one.learn20200127;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
	
	public static void main(String[] args) {
//		Cargo cargo = new Cargo("包子", false);
//		Runnable thread = new ProducerThread(cargo);
//		Runnable thread2 = new ConsumerThread(cargo);
//		new Thread(thread, "producer").start();
//		new Thread(thread2, "consumer").start();
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		newFixedThreadPool.submit(() ->{
			System.out.println("执行了");
		});
	}

}
