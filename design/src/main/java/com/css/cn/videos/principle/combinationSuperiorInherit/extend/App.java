package com.css.cn.videos.principle.combinationSuperiorInherit.extend;

import java.util.Stack;

public class App {
	public static void main(String[] args) {
		//栈
		Stack<String> stack = new Stack<>();
		
		stack.add("a");
		stack.add("b");
		stack.add("c");

//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		System.out.println(stack.get(1)); //栈竟然能通过角标 获取。这是jdk不完美的地方，因为stack继承了Vector 而没有用组合
//		new ConcurrentHashMap<K, V>()
	}

}
