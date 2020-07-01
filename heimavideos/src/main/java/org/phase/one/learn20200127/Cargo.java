package org.phase.one.learn20200127;

public class Cargo {
	private String name ; 
	private boolean flag;
	Cargo(String name, boolean flag) {
		super();
		this.name = name;
		this.flag = flag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	

}
