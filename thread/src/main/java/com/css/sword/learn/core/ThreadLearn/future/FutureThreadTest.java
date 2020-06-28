package com.css.sword.learn.core.ThreadLearn.future;


public class FutureThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		long begin = System.currentTimeMillis();
		FutureThreadTest ft = new FutureThreadTest();
		Shopping shopping = ft.new Shopping();
		
		Thread t1 = new Thread(shopping);
		t1.start();
		t1.join();
		//获取到购买的厨具
		KitcheWare kw = shopping.kw;
		
		FoodMaterial fm = ft.new FoodMaterial();
		Thread.sleep(2000);
		System.out.println("第二步，食材已到位");
		ft.cooking(kw, fm);
		Thread.sleep(1000);
		System.out.println("第三步，美食烹饪完成");
		long end = System.currentTimeMillis();
		System.out.println("制作美食总耗时:"+ (end-begin));
	}
	
	/**
	 * 购买厨具线程
	 * @author wyx11
	 *
	 */
	private class Shopping implements Runnable{
		KitcheWare kw;
		@Override
		public void run() {
			System.out.println("第一步，网上下单");
			System.out.println("第一步，等待厨具");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("第一步，快递送货");
			kw = new KitcheWare();
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
