package org.phase.one.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IoTest {
	public static void main(String[] args)  {
		String fileName = "D:\\files\\workspaces\\MyLearn\\day01\\zhaoyong\\test001.txt";
		File file = new File(fileName);
		OutputStream outputStream = null;
		try {
			file.createNewFile();
			outputStream = new FileOutputStream(file);
			outputStream.write(97);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(outputStream!=null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		int read = 0;
		
		while((read=("fds".length()))!= -1) {
			
		}
	}

}
