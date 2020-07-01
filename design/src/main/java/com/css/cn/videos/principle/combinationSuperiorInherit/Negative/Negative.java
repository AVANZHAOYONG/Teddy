package com.css.cn.videos.principle.combinationSuperiorInherit.Negative;

import java.util.Collection;
import java.util.HashSet;

public class Negative extends HashSet<String> {

	private int count = 0; 
	
	@Override
	public boolean add(String e) {
		count += 1;
		return super.add(e);
	}
	
	/**
	 * 我们不知道 addAll 内部调用的是 add  所以在统计时会有错误，并且不知道 是否被其他方法调用
	 */
	@Override
	public boolean addAll(Collection<? extends String> c) {
		count += c.size() ;
		return super.addAll(c);
	}
	
	public int getCount() {
		return count;
	}
	
	
	public static void main(String[] args) {
		Negative negative = new Negative();
		negative.add("a");
		negative.add("b");
		negative.add("c");
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("d");
		hashSet.add("e");
		negative.addAll(hashSet);
		System.out.println(negative.getCount()); //实际5次 但输出7次
	}
}
