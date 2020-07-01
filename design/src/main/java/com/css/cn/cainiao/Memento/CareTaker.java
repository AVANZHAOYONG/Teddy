package com.css.cn.cainiao.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mems = new ArrayList<Memento>();
	
	public void add(Memento mem) {
		mems.add(mem);
	}

	public Memento get(int index) {
		return mems.get(index);
	}
	
}
