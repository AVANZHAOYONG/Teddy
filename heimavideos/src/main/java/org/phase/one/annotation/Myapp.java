package org.phase.one.annotation;

public class Myapp {
	
	public static void main(String[] args) {
		Class<MyPersen> test = MyPersen.class;
		MyAnnotation annotation = test.getAnnotation(MyAnnotation.class);
		System.out.println(annotation.name());
		System.out.println(annotation.value());
	}

}
