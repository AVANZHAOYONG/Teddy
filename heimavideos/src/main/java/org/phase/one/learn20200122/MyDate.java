package org.phase.one.learn20200122;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
	
	public static void main(String[] args) throws ParseException {
		DateTest1();
		
	}

	private static void DateTest1() {
		String[] src = new String[100];
		for (int i = 0; i < src.length; i++) {
			src[i]="num:"+i;
		}
		String[] dest = new String[10];
		System.arraycopy(src, 47, dest, 0, 10);
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		
	}

	private static void DateTest() throws ParseException {

		Scanner in = new Scanner(System.in);
		System.out.println("请输入您的生日（格式如下：yyyy-MM-dd）：");
		String next = in.next();
		DateFormat instance2 = DateFormat.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = dateFormat.parse(next);
		long time = parse.getTime();
		long currentTimeMillis = System.currentTimeMillis();
		long dayMillis = currentTimeMillis - time;
		System.out.println("您已出生："+(dayMillis/1000/60/60/24)+"天");
		
		String localeString = parse.toLocaleString();
		System.out.println(localeString);
		
		Calendar instance = Calendar.getInstance();
		int i = instance.get(Calendar.YEAR);
	}
	
	

}
