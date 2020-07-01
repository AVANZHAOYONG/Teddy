package com.css.cn.videos.principle.interfaceIsolation.positive;

import org.css.com.principle.interfaceIsolation.entries.Book;

public interface BookDao {

	void insert(Book book);
	void delete(Book book);
	void update(Book book);
	Book find();
}
