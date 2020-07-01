package com.css.cn.videos.principle.interfaceIsolation.negative;


import com.css.cn.videos.principle.interfaceIsolation.entries.Book;
import com.css.cn.videos.principle.interfaceIsolation.entries.User;

public interface Dao {
	
	void insert(User user);
	void delete(User user);
	void update(User user);
	User findUser();
	
	void insert(Book book);
	void delete(Book book);
	void update(Book book);
	Book findBook();

}
