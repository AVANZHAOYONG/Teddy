package org.phase.one.io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class UTF_Gbk_test {
	
	public static void main(String[] args) {
		String fileName = "D:\\files\\workspaces\\MyLearn\\day01\\zhaoyong\\utfGbk.txt";
		char[] text = "你好".toCharArray();
		String charsetName = "utf-8";
//		String charsetName = "GBK";
		write_utf8(fileName, text, charsetName);
	}

	//写入utf-8
	private static void write_utf8(String fileName, char[] text, String charsetName) {
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), charsetName),1024)){
			writer.write(text);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
