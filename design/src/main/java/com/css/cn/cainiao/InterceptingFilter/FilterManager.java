package com.css.cn.cainiao.InterceptingFilter;

public class FilterManager {

	private FilterChain filterChain;

	public FilterManager( Target target) {
		super();
		this.filterChain = new FilterChain();
		filterChain.setTarget(target);
	}
	
	public void addFilter(FilterInter filter) {
		filterChain.addFilter(filter);
	}
	
	public void execute(String req) {
		filterChain.filterRequest(req);
	}
}
