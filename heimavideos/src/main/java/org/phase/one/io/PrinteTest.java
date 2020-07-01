package org.phase.one.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrinteTest {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "zhaoyong\\print.txt";
		System.out.println("dsatfdsjfalk");
		PrintStream printStream = new PrintStream(fileName);
		System.setOut(printStream);
		atest01();
	}

	private static void atest01() {
		System.out.println("fdsa");
		System.out.println("fdsa1");
		System.out.println("fdsa2");
	}
}
