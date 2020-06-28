package com.css.sword.learn.core.ThreadLearn.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;




public class FutureThreadTest1 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long begin = System.currentTimeMillis();
		FutureThreadTest1 ft1 = new FutureThreadTest1();
		shopping<KitcheWare> shopping = ft1.new shopping<KitcheWare>();
		FutureTask<KitcheWare> futureTask = new FutureTask<>(shopping);		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(futureTask);
		KitcheWare kw = futureTask.get();
		
		System.out.println("第二步，购买食物");
		FoodMaterial fm = ft1.new FoodMaterial();
		Thread.sleep(1000);
		
		System.out.println("第三步，开始烹饪");
		ft1.cooking(kw, fm);
		Thread.sleep(1000);
		
		long end = System.currentTimeMillis();
		
		System.out.println("完成，总耗时："+(end-begin));
		
	}
	
	private class shopping<V extends KitcheWare> implements Callable<V> {

		private KitcheWare kw;
		@Override
		public V call() throws Exception {
			System.out.println("第一步，网上下单");
			System.out.println("第一步，等待厨具");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("第一步，快递送货");
			kw = new KitcheWare();
			return (V)kw;
		}
	}
	
	/**
	 * 厨具类
	 * @author wyx11
	 *
	 */
	private class KitcheWare{
		
	}

	/**
	 * 食材
	 * @author wyx11
	 *
	 */
	private class FoodMaterial{
		
	}
	
	/**
	 * 做饭
	 * @param kw
	 * @param fm
	 */
	public void cooking(KitcheWare kw, FoodMaterial fm) {
		
	}

}
