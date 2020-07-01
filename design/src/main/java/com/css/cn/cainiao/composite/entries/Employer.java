package com.css.cn.cainiao.composite.entries;

import java.util.ArrayList;
import java.util.List;

public class Employer {
	
	private String name ; 
	private int age ;
	private String position;
	private List<Employer> subordinates;
	
	public Employer(String name, int age, String position) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.subordinates = new ArrayList<Employer>();
	}
	
	public List<Employer> getSubordinates() {
		return subordinates;
	}


	public void add(Employer emp) {
		subordinates.add(emp);
	}

	@Override
	public String toString() {
		return "name:"+this.name+",age:"+this.age+"position:"+this.position;
	}
}
