package com.css.cn.videos.dp.prototype;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date productDate = format.parse("2018-05-06 15:36:45");
		Date saleDate = format.parse("2020-01-03 05:13:03");
		Date saleDate1 = format.parse("2020-03-03 12:13:03");
		Car car = new Car();
		car.setName("本田CR-V");
		car.setPrice(320000);
		car.setProductDate(productDate);
		car.setSaleDate(saleDate);
		
		Car car2 = (Car)car.clone();
		//降价了
		car2.setPrice(120000);
		car2.setSaleDate(saleDate1);
		System.out.println(car);
		System.out.println(car2);
	}
}
