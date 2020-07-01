package com.css.cn.cainiao.DataAccess;

import java.util.List;

public interface Dao {
	
	int insert(Student stu);
	int delete(Student stu);
	int update(Student stu);
	List<Student> queryAll();

}
