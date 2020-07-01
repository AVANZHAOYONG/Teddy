package com.css.cn.cainiao.filter.inter;

import java.util.List;

import com.css.cn.filter.entries.Person;

public interface Criteria {
	List<Person> meetCriteria(List<Person> ps);

}
