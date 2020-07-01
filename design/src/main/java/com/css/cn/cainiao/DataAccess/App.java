package com.css.cn.cainiao.DataAccess;

import java.util.List;

public class App {

	public static void main(String[] args) {
		DaoImpl daoImpl = new DaoImpl();
		int insert = daoImpl.insert(new Student("赵塞克斯", 21));
		System.out.println(insert);
		List<Student> queryAll = daoImpl.queryAll();
		queryAll.stream().forEach(s->{
			System.out.println(s.getName()+","+s.getAge());
		});
		
	}
}
