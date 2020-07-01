package org.phase.one.io.serialize;

import java.io.Serializable;

public class Cat implements Serializable {
	
//	private static final long serialVersionUID = 1L;
	
	private String name ; 
	private int age ; 
	private transient String coler ;
	private static int height;
	Cat(String name, int age, String coler) {
		super();
		this.name = name;
		this.age = age;
		this.coler = coler;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColer() {
		return coler;
	}
	public void setColer(String coler) {
		this.coler = coler;
	}
	public static int getHeight() {
		return height;
	}
	public static void setHeight(int height) {
		Cat.height = height;
	}
	
	@Override
	public String toString() {
		return getName()+getAge()+getColer()+getHeight();
	}
	
	

}
