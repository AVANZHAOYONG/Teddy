package com.css.cn.videos.dp.builder.builder.impl;

import com.css.cn.videos.dp.builder.builder.ComputerBuilder;
import com.css.cn.videos.dp.builder.product.Computer;

public class GameCoputerBuilder implements ComputerBuilder {

	private Computer com = new Computer();
	private String cpu = "GameCpu";
	private String gpu = "GameGpu";
	private String mem = "GameMem";
	
	
	@Override
	public ComputerBuilder setCpu(String cpu) {
		this.cpu = cpu;
		return this;
	}

	@Override
	public ComputerBuilder setGpu(String gpu) {
		this.gpu = gpu;
		return this;
	}

	@Override
	public ComputerBuilder setMem(String mem) {
		this.mem = mem;
		return this;
	}

	@Override
	public Computer build() {
//		建造过程
		com.setCpu(cpu);
		com.setGpu(gpu);
		com.setMem(mem);
		return com;
		
	}

}
