package com.css.cn.videos.dp.builder.builder;

import com.css.cn.videos.dp.builder.product.Computer;

public interface ComputerBuilder {
	
	ComputerBuilder setCpu(String cpu);
	ComputerBuilder setGpu(String gpu);
	ComputerBuilder setMem(String mem);
	Computer build();

}
