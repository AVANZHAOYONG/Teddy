package com.css.cn.cainiao.iterator;

import java.util.Date;

import com.css.cn.cainiao.iterator.entries.IteratorArray;
import com.css.cn.cainiao.iterator.entries.MCollections;
import com.css.cn.cainiao.iterator.entries.MyCollecte;

public class App {

	public static void main(String[] args) {
		MCollections collecte = new MyCollecte(10);
		IteratorArray iterator = collecte.getIterator();
		collecte.add("abcd");
		collecte.add(143);
		collecte.add(new Date());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			}
		}
}
