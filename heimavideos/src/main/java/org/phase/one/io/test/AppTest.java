package org.phase.one.io.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AppTest {

	public static void main(String[] args) {
		String src = "F:\\AVAN第一学习视屏\\阶段01.javase基础+高级\\08.File类与IO流\\08 转换流\\01_字符编码和字符集.flv";
		String des = "F:\\zhaoyong";
		//时间太长了
//		long beginTime = System.currentTimeMillis();
//		copy(src, des);
//		long endTime = System.currentTimeMillis();
//		System.out.println("copy cost time:"+ (endTime - beginTime)+"毫秒");
		
		long beginTime1 = System.currentTimeMillis();
		copyArray(src, des);
		long endTime1 = System.currentTimeMillis();
		System.out.println("copyArray cost time:"+ (endTime1 - beginTime1)+"毫秒");
		
		long beginTime2 = System.currentTimeMillis();
		bufferCopy(src, des);
		long endTime2 = System.currentTimeMillis();
		System.out.println("bufferCopy cost time:"+ (endTime2 - beginTime2)+"毫秒");
		
		long beginTime3 = System.currentTimeMillis();
		bufferCopyArray(src, des);
		long endTime3 = System.currentTimeMillis();
		System.out.println("bufferCopyArray cost time:"+ (endTime3 - beginTime3)+"毫秒");
	}
	
	private static void copy(String src, String des) {
		try (InputStream input = new FileInputStream(src);OutputStream output = new FileOutputStream(des)) {
			int len ;
			while((len = input.read())!=-1) {
				output.write(len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void copyArray(String src, String des) {
		try (InputStream input = new FileInputStream(src);OutputStream output = new FileOutputStream(des)) {
			int len ;
			byte[] bt = new byte[1024];
			while((len = input.read(bt))!=-1) {
				output.write(bt,0,len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void bufferCopy(String src, String des) {
		try (InputStream input = new BufferedInputStream(new FileInputStream(src),1024);OutputStream output = new BufferedOutputStream(new FileOutputStream(des),1024)) {
			int len ;
			while((len = input.read())!=-1) {
				output.write(len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void bufferCopyArray(String src, String des) {
		try (InputStream input = new BufferedInputStream(new FileInputStream(src), 1024);OutputStream output = new BufferedOutputStream(new FileOutputStream(des), 1024)) {
			int len ;
			byte[] bt = new byte[1024];
			while((len = input.read(bt))!=-1) {
				output.write(bt,0,len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
