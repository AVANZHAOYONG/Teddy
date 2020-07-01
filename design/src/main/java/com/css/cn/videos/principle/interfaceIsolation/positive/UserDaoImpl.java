package com.css.cn.videos.principle.interfaceIsolation.positive;

import com.css.cn.videos.principle.interfaceIsolation.entries.User;

/**
 *接口隔离原则 一个类对另一个类的依赖应该建立在最小的接口上。
 * @author 赵勇
 *
 */
public class UserDaoImpl implements UserDao {

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
	public User find() {
		System.out.println("ok");
		return new User();
	}



}
