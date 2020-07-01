package com.css.cn.cainiao.Facade.facade;

import com.css.cn.cainiao.Facade.entries.Cpu;
import com.css.cn.cainiao.Facade.entries.mem;
import com.css.cn.cainiao.Facade.entries.stage;

public class Computer {
	private Cpu cpu ; 
	private mem m;
	private stage s;
	public Computer() {
		super();
		this.init();
	}
	
	private void init() {
		
		this.cpu = new Cpu();
		this.m = new mem();
		this.s = new stage();
	}
	
	
	public void start() {
		cpu.start();
		m.start();
		s.start();
	}
	
	public void shutdown() {
		cpu.shutdown();
		m.shutdown();
		s.shutdown();
	}

}
