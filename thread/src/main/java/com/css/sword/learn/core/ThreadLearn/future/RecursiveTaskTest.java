package com.css.sword.learn.core.ThreadLearn.future;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class RecursiveTaskTest extends RecursiveTask<Integer> {
	
	/**
	 * 竟然还需要序列化？
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer num ; 
	
	public RecursiveTaskTest(Integer num) {
		super();
		this.num = num;
	}

	@Override
	protected Integer compute() {
		if(num <= 1) {
			return num  ;
		}
		RecursiveTask<Integer> task = new RecursiveTaskTest(num-1) ;
		task.fork();
		
		return num*num + task.join();
	}

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		ForkJoinTask<Integer> task = new RecursiveTaskTest(10);
		forkJoinPool.execute(task);
		Integer join = task.join();
		System.out.println(join);
	}

}
