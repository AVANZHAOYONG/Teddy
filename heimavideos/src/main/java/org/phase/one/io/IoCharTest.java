package org.phase.one.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IoCharTest {
	public static void main(String[] args) throws IOException {
		String fileName = "D:\\files\\workspaces\\MyLearn\\day01\\zhaoyong\\charRead.txt";
		char[] text = new char[] {'a','赵','y','你','好'};
		
		outPut(fileName, text);
		
		char[] read = new char[5];
		
		inPut(fileName, read);
		System.out.println(new String(read));
	}

	
	private static void outPut(String fileName, char[] textArea)  {
		
		try (Writer write = new FileWriter(fileName,false)){
			write.write(textArea);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void inPut(String fileName, char[] readText) throws IOException {
		File file = new File(fileName);
		Reader fileReader = new FileReader(file);
		fileReader.read(readText);
		return ;
	}
}
