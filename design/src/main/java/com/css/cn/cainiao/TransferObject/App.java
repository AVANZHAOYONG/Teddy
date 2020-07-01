package com.css.cn.cainiao.TransferObject;

public class App {
	
	   public static void main(String[] args) {
		      StudentBo studentBusinessObject = new StudentBo();
		 
		      //输出所有的学生
		      for (StudentVo student : studentBusinessObject.getAllStudents()) {
		         System.out.println("Student: [RollNo : "
		         +student.getRollNo()+", Name : "+student.getName()+" ]");
		      }
		 
		      //更新学生
		      StudentVo student =studentBusinessObject.getAllStudents().get(0);
		      student.setName("Michael");
		      studentBusinessObject.updateStudent(student);
		 
		      //获取学生
		      studentBusinessObject.getStudent(0);
		      System.out.println("Student: [RollNo : "
		      +student.getRollNo()+", Name : "+student.getName()+" ]");
		   }
	

}
