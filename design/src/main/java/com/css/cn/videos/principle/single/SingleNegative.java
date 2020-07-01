package com.css.cn.videos.principle.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 单一设计原则 反例
 * @author 赵勇
 *
 */
public class SingleNegative {
	
	/**
	 * 一个方法要有好多职责
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String charset = "UTF8";
//		System.getProperty("user.dir")
		File file = new File(SingleNegative.class.getResource("/").getPath());
		String fName = "readme.txt";
		file = new File(file, fName);
		FileInputStream inputStream = new FileInputStream(file);
		
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
		
		int index = 0 ;
		StringBuilder sb = new StringBuilder();
		while(index!=-1) {
			char[] ch = new char[1024];
			index = inputStreamReader.read(ch);
			sb.append(new String(ch));
		}
		
		inputStreamReader.close();
		inputStream.close();
		
		
		String string = sb.toString();
		System.out.println(string);
		
		String[] split = string.split("[^a-zA-Z]+");
		
		for (String string2 : split) {
			System.out.println(string2);
		}
	}

}
