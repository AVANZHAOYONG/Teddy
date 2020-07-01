package com.css.cn.videos.dp.builder.product;

public class Computer {
	
	private String cpu ; 
	private String gpu;
	private String mem ;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public String getMem() {
		return mem;
	}
	public void setMem(String mem) {
		this.mem = mem;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", gpu=" + gpu + ", mem=" + mem + "]";
	}

	
	
}
