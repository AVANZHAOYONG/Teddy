package org.phase.one.io;

import java.io.File;

public class DiGui {
	
	public static void main(String[] args) {
		File file = new File("D:\\files\\workspaces\\MyLearn\\day01\\zhaoyong");
		getFile(file);
	}


	private static void getFile(File file) {
		if(file.isFile()) {
			System.out.println(file.getPath());
			return ;
		}
		
		for (File file1 : file.listFiles()) {
			getFile(file1);
		}
	}
	
}
