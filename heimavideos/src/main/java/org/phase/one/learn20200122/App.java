package org.phase.one.learn20200122;

import java.util.Objects;

public class App {
	
	public static void main(String[] args) {
		
		Person person = new Person("zhaoyong", 19);
		System.out.println(person.toString());
		String s1 = null;
		String s2 = new String("abc");
		
		
		boolean equals = Objects.equals(s1, s2);
		System.out.println(equals);
	}

}
