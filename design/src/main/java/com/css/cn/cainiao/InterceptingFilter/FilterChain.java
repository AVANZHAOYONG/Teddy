package com.css.cn.cainiao.InterceptingFilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	
	private List<FilterInter> filters ;
	private Target target ;

	public FilterChain() {
		super();
		this.filters = new ArrayList<FilterInter>();
	}
	
	public void addFilter(FilterInter filter) {
		filters.add(filter);
	}

	public void setTarget(Target target) {
		this.target = target;
	}
	
	public void filterRequest(String req) {
		for (FilterInter filterInter : filters) {
			filterInter.excute(req);
		}
		target.excute(req);
	}
	
}
