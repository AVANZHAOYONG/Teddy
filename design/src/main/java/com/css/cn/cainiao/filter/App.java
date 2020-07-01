package com.css.cn.cainiao.filter;

import java.util.ArrayList;
import java.util.List;

import com.css.cn.filter.entries.Person;
import com.css.cn.filter.inter.Criteria;
import com.css.cn.filter.inter.CriteriaSingle;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person("ssee", 23);
		Person person2 = new Person("s", 2);
		Person person3 = new Person("ee", 3);
		List<Person> list = new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		
		Criteria single = new CriteriaSingle();
		List<Person> meetCriteria = single.meetCriteria(list);
		meetCriteria.forEach(p->{
			System.out.println(p.getName()+","+p.getAge());
		});
	}
}
