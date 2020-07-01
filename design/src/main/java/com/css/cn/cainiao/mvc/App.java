package com.css.cn.cainiao.mvc;

import com.css.cn.mvc.controller.StudentController;
import com.css.cn.mvc.model.Student;
import com.css.cn.mvc.view.ConsoleView;

public class App {
	public static void main(String[] args) {
		Student model = getDataFromDB();
		
		ConsoleView view = new ConsoleView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		controller.setAge(19);
		
		controller.updateView();
		
		
	}

	private static Student getDataFromDB() {
		Student student = new Student();
		student.setAge(18);
		student.setName("赵勇");
		return student;
	}
	

}
