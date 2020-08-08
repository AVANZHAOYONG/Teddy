package com.css.cn.cainiao.Observer;

import java.util.ArrayList;
import java.util.List;

import com.css.cn.cainiao.Observer.entries.Observer;

public class Subject {
	
	private String data ;
	private List<Observer> obsers = new ArrayList<Observer>();

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
		notifyAll1();
	} 
	
	private void notifyAll1() {
		for (Observer observer : obsers) {
			observer.update(data);
		}
		
	}

	public void addAttach(Observer obs) {
		obsers.add(obs);
	}

	
	
}
