package com.css.cn.cainiao.DataAccess;

import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao {
	
	private List<Student> stus ;
	

	public DaoImpl() {
		super();
		/**
		 * 模拟数据库
		 */
		this.stus = new ArrayList<Student>();
		this.stus.add(new Student("张思瑞", 18));
		this.stus.add(new Student("李福尔", 19));
		this.stus.add(new Student("王发物", 20));
	}

	@Override
	public int insert(Student stu) {
		if(this.stus.add(stu)) {
			return 1;
		}
		return 0;
	}

	@Override
	public int delete(Student stu) {
		if(this.stus.remove(stu)) {
			return 1;
		}
		return 0;
	}

	@Override
	public int update(Student stu) {
		return 0;
	}

	@Override
	public List<Student> queryAll() {
		return this.stus;
	}

}
