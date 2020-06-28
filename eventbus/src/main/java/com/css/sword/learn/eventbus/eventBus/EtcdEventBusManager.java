package com.css.sword.learn.eventbus.eventBus;



import com.css.sword.learn.eventbus.eventBus.impl.EtcdEventBus;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class EtcdEventBusManager {
	
	private static final String identifier = "etcdEventBus" ; 
	private static ThreadPoolExecutor threadPoolExecutor = getThreadPool();
	private static EventBus singleton = null ;
	
	private static ThreadPoolExecutor getThreadPool() {
		 return new ThreadPoolExecutor(10, 15, 100, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(20), new ThreadFactory() {
			
			@Override
			public Thread newThread(Runnable r) {
		        Thread thread = new Thread(r, identifier+"_thread");

		        thread.setDaemon(false);
		        if (thread.getPriority() != Thread.NORM_PRIORITY) {
		            thread.setPriority(Thread.NORM_PRIORITY);
		        }
		        return thread;
			}
		});
	}
	
	

	public static EventBus get() {
		if(singleton == null ) {
			synchronized (EventBus.class) {
				if(singleton==null) {
					singleton = new EtcdEventBus(identifier , threadPoolExecutor);
				}
			}
		}
		return singleton ; 
	}

	public static void close() {
		singleton = null ;
		threadPoolExecutor.shutdown();
	}
	
}
