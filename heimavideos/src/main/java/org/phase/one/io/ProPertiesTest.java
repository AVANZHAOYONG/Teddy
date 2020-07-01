package org.phase.one.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

public class ProPertiesTest {
	public static void main(String[] args) {
		String fileName = "D:\\files\\workspaces\\MyLearn\\day01\\zhaoyong\\hello.txt";
		store(fileName);
		System.out.println("========");
		load(fileName);
		
	}

	private static void store(String fileName) {
		try(Writer writer = new FileWriter(fileName)) {
			Properties pro =  new Properties();
			pro.setProperty("闫", "美丽");
			pro.setProperty("赵", "靓仔");
			pro.store(writer, "It`s test!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void load(String fileName) {
		try(Reader read = new FileReader(fileName)) {
			Properties pro = new Properties();
			pro.load(read);
			Set<String> stringPropertyNames = pro.stringPropertyNames();
			for (String string : stringPropertyNames) {
				System.out.println(string+"="+pro.getProperty(string));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
