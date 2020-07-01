package com.css.cn.videos.principle.combinationSuperiorInherit.Positive;

import java.util.Collection;
import java.util.HashSet;

/**
 * 组合优于继承
 * @author 赵勇
 *
 */
public class Positive {

	private HashSet<String> set = new HashSet<String>();
	private int count = 0; 
	
	public boolean add(String e) {
		count += 1;
		return set.add(e);
	}
	

	public boolean addAll(Collection<? extends String> c) {
		count += c.size() ;
		return set.addAll(c);
	}
	
	public int getCount() {
		return count;
	}
	
	
	public static void main(String[] args) {
		Positive negative = new Positive();
		negative.add("a");
		negative.add("b");
		negative.add("c");
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("d");
		hashSet.add("e");
		negative.addAll(hashSet);
		System.out.println(negative.getCount()); //没有问题了
	}
}
