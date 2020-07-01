package org.phase.one.io;

import java.io.File;

public class LearnFileTest {
	public static void main(String[] args) {
		File file = new File("zhaoyong.txt");
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
	}

}
