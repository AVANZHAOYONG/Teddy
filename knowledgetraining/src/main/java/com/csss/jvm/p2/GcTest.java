package com.csss.jvm.p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GcTest {
	
	public static void main(String[] args) throws InterruptedException {
		while (true) {
			int random = new Random().nextInt();
			List<Map<String,String>> list = new ArrayList<Map<String, String>>();
			
			if(random%2 == 0) {
				list.clear();
			}else {
				for (int i = 0; i < 10000; i++) {
					Map<String,String> map = new HashMap<String, String>();
					map.put("key"+i, "i_"+System.currentTimeMillis());
					list.add(map);
				}
			}
			
			Thread.sleep(1000);
			
			
		}
	}

}
