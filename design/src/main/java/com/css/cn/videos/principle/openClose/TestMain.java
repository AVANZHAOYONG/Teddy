package com.css.cn.videos.principle.openClose;

public class TestMain {
	public static void main(String[] args) {
		negative();
		positive();
	}

	private static void positive() {
		Car discountCar = new DiscountCar();
		discountCar.setName("路虎车1");
		discountCar.setPrice(1000.00);
		System.out.println(discountCar);
	}

	private static void negative() {
		Car ocNegative = new Car();
		ocNegative.setName("路虎车");
		ocNegative.setPrice(1000.00);
		System.out.println(ocNegative);
		//此时价格变化 商品打折 
		//违反开闭原则  修改 代码
	}
}
