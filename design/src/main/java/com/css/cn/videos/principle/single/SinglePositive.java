package com.css.cn.videos.principle.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * 单一设计原则 正例
 * @author 赵勇
 *
 */
public class SinglePositive {
	
	private static String charset = "UTF8";
	
	public static void main(String[] args) throws IOException {

		String fName = "readme.txt";
		String sb = loadConfig(fName);
		String[] split = paserConfig(sb);
		
		for (String string2 : split) {
			System.out.println(string2);
		}
	
	}

	private static String[] paserConfig(String config) {
		String[] split = config.split("[^a-zA-Z]+");
		return split;
	}

	private static String loadConfig(String fName) throws FileNotFoundException, UnsupportedEncodingException, IOException {
//		System.getProperty("user.dir")
		File file = new File(SingleNegative.class.getResource("/").getPath());
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
		return sb.toString();
	}

}
