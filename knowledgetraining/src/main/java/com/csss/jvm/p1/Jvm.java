package com.csss.jvm.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Jvm {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 1000000; i++) {
			String str = "";
			for (int j = 0; j < 1000; j++) {
				str += UUID.randomUUID().toString().replaceAll("-", "");
			}
			list.add(str);
		}
		
		
	}
}
