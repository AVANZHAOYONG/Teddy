package org.phase.one.learn20200123;

import java.util.HashSet;
import java.util.Set;

public class Collection {
	public static void main(String[] args) {
		setTest();
		
	}

	private static void setTest() {
		Set<String> setA = new HashSet();
		
		for (int i = 0; i < setA.size(); i++) {
			setA.forEach(k->{
				System.out.println(k);
			});
		}
		
	}

}
