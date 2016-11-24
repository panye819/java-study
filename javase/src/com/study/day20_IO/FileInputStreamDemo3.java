package com.study.day20_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一次读取一个字符数组
 *
 */
public class FileInputStreamDemo3 {

	public static void main(String[] args) throws IOException {
		//定义对象
		FileInputStream fis = new FileInputStream("IODemo\\fis2.txt");
		//
		
		byte[] bys = new byte[5];
		int len = fis.read(bys);
		System.out.println(len);
		
		
		//释放资源
		fis.close();
		
		
		
		
		
		
		
	}	
}
