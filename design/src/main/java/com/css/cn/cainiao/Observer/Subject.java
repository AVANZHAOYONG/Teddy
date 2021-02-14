package com.css.cn.cainiao.Observer;

import com.css.cn.cainiao.Observer.entries.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private String data ;
	private List<Observer> obsers = new ArrayList<>();

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

	public void removeAttach(Observer obs){
		int i = obsers.indexOf(obs);
		if(i > 0){
			obsers.remove(i);
		}
	}
	
	
}
