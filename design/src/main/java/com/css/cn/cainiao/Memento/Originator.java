package com.css.cn.cainiao.Memento;

public class Originator {
	
	private String data;

	public Originator() {
		super();
	}

	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}

	public Memento saveMemento() {
		return new Memento(data);
	}

	public String getMemento(Memento mem) {
		return mem.getData();
	}
}
