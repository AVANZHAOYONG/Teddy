package com.css.cn.cainiao.composite;

import java.util.List;

import com.css.cn.cainiao.composite.entries.Employer;

public class App {

	public static void main(String[] args) {
		Employer ceo = new Employer("张思瑞", 18, "ceo");
		Employer manager1 = new Employer("李四", 28, "manager");
		Employer manager2 = new Employer("王五", 38, "manager");
		Employer worker1 = new Employer("赵六", 48, "worker");
		Employer worker2 = new Employer("刘七", 58, "worker");
		Employer worker3 = new Employer("吴八", 68, "worker");
		
		
		ceo.add(manager1);
		ceo.add(manager2);
		manager1.add(worker1);
		manager2.add(worker3);
		manager1.add(worker2);
		
		printeTree(ceo);
	}

	private static void printeTree(Employer emp) {
		System.out.print(emp);
		List<Employer> subordinates = emp.getSubordinates();
		for (Employer employer : subordinates) {
			printeTree(employer);
		}
	}

	
	
}
