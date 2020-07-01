package com.css.cn.cainiao.filter.inter;

import java.util.ArrayList;
import java.util.List;

import com.css.cn.cainiao.filter.entries.Person;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> ps) {
		List<Person> list = new ArrayList<Person>();
		for (Person person : ps) {
			if("s".equalsIgnoreCase(person.getName())){
				list.add(person);
			}
		}
		return list;
	}

}
