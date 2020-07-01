package com.css.cn.cainiao.Memento;

public class App {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setData("seata 1 ");
		originator.setData("seata 2 ");
		careTaker.add(originator.saveMemento());
		
		originator.setData("seata 3 ");
		careTaker.add(originator.saveMemento());
		originator.setData("seata 4 ");
		careTaker.add(originator.saveMemento());
		originator.setData("seata 5 ");
		
		System.out.println(originator.getData());
		
		System.out.println(careTaker.get(0).getData());
		System.out.println(careTaker.get(1).getData());
		System.out.println(careTaker.get(2).getData());
		
		
	}
}
