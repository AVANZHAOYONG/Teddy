package com.css.cn.cainiao.builder;

import com.css.cn.builder.entries.computer;

public interface builder {
	
	builder setName(String name);
	builder setPrice(double price);
	builder setOs();
	
	computer build();

}
