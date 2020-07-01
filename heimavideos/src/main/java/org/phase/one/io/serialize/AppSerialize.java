package org.phase.one.io.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AppSerialize {

	public static void main(String[] args) {
		String fileName = "D:\\files\\workspaces\\MyLearn\\day01\\zhaoyong\\serialize.txt";
		Cat cat = new Cat("cat", 18, "红色");
//		write(fileName, cat);
		read(fileName);
	}
	
	private static void write(String fileName,Object obj) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void read(String fileName) {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			Object readObject = in.readObject();
			Cat cat = (Cat)readObject;
			System.out.println(cat);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
