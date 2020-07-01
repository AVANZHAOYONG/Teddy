package com.css.cn.videos.dp.adapter.demo2.adapter;

import org.css.com.dp.adapter.demo2.entities.Program;
import org.css.com.dp.adapter.demo2.immutableCode.Filter;

public class MyAdapter implements Program {

	private Filter filter ; 
	
	
	public MyAdapter(Filter filter) {
		super();
		this.filter = filter;
	}

	@Override
	public String name() {
		return filter.getTile();
	}

	@Override
	public String process(Object obj) {
		return obj.toString();
	}
	

}
