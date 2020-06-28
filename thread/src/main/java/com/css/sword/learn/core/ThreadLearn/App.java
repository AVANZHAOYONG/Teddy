package com.css.sword.learn.core.ThreadLearn;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
		FutureTask<String> futureTask1 = new FutureTask<String>(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("执行了");
			}
		}, "hello");
		
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(futureTask1);
		String string = futureTask1.get();
		System.out.println(string);
    }
}
