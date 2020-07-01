package org.phase.one.learn20200122;

public class WrapperClass {
	public static void main(String[] args) {
		
		Integer valueOf = Integer.valueOf("100");
		int intValue = valueOf.intValue();
		System.out.println(intValue);
		String valueOf2 = String.valueOf(1000);
		System.out.println(valueOf2);
	}

}
