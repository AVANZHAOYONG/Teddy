package com.css.cn.videos.dp.adapter.demo2.immutableCode;

public class MyEntities {
	private static long count ;
	private long id = count++;
	
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "MyEntities [id=" + id + "]";
	}

	
}
