package com.css.cn.cainiao.mvc.controller;

import com.css.cn.mvc.model.Student;
import com.css.cn.mvc.view.ConsoleView;

public class StudentController {
	
	private Student model ; 
	private ConsoleView view;
	public StudentController(Student model, ConsoleView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void setName(String name) {
		model.setName(name);
	}
	
	public void setAge(int age) {
		model.setAge(age);
	}
	
	public String getName() {
		return model.getName();
	}
	
	public int getAge() {
		return model.getAge();
	}
	
	public void updateView() {
		view.printeStudentDetails(getName(), getAge());
	}

}
