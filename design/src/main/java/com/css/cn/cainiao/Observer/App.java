package com.css.cn.cainiao.Observer;

import com.css.cn.cainiao.Observer.entries.observer1;
import com.css.cn.cainiao.Observer.entries.observer2;
import com.css.cn.cainiao.Observer.entries.observer3;

public class App {
	public static void main(String[] args) {
		Subject subject = new Subject();
		observer1 observer1 = new observer1();
		observer2 observer2 = new observer2();
		observer3 observer3 = new observer3();

		subject.addAttach(observer1);
		subject.addAttach(observer2);
		subject.addAttach(observer3);

		subject.setData("hello");
		subject.setData("world");
	}

}
