package com.css.cn.videos.principle.interfaceIsolation.negative;

import org.css.com.principle.interfaceIsolation.entries.Book;
import org.css.com.principle.interfaceIsolation.entries.User;

/**
 * 没必要实现book类
 * @author 赵勇
 *
 */
public class UserDao implements Dao {

	@Override
	public void insert(User user) {
		System.out.println("ok");
	}

	@Override
	public void delete(User user) {
		System.out.println("ok");
	}

	@Override
	public void update(User user) {
		System.out.println("ok");
	}

	@Override
	public User findUser() {
		System.out.println("ok");
		return new User();
	}

	@Override
	public void insert(Book book) {
		throw new RuntimeException();
	}

	@Override
	public void delete(Book book) {
		throw new RuntimeException();
	}

	@Override
	public void update(Book book) {
		throw new RuntimeException();
	}

	@Override
	public Book findBook() {
		throw new RuntimeException();
	}

}
