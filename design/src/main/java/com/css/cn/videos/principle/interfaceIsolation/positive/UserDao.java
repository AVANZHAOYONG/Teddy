package com.css.cn.videos.principle.interfaceIsolation.positive;


import org.css.com.principle.interfaceIsolation.entries.User;

public interface UserDao {
	
	void insert(User user);
	void delete(User user);
	void update(User user);
	User find();
	
}
