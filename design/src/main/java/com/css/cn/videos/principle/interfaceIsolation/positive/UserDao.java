package com.css.cn.videos.principle.interfaceIsolation.positive;


import com.css.cn.videos.principle.interfaceIsolation.entries.User;

public interface UserDao {
	
	void insert(User user);
	void delete(User user);
	void update(User user);
	User find();
	
}
