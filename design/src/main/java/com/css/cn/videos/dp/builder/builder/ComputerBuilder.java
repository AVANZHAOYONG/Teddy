package com.css.cn.videos.dp.builder.builder;

import org.css.com.dp.builder.product.Computer;

public interface ComputerBuilder {
	
	ComputerBuilder setCpu(String cpu);
	ComputerBuilder setGpu(String gpu);
	ComputerBuilder setMem(String mem);
	Computer build();

}
