package com.study.day20_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream
 * 	如果读取到的数据返回值是-1，就说明读取到文件的末尾了
 * 
 *
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("IODemo\\a2.txt");
//		int by = fis.read();
//		//第一次读取
//		System.out.println(by);
//		System.out.println((char)by);
//		//第二次读取
//		 by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		//第三次读取
//		 by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		//第四次读取
//		 by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		while(by != -1){
//			System.out.print((char)by);
//			by = fis.read();
//		}
		int by = 0;
		while((by=fis.read())!= -1){
			System.out.print((char)by);
		}
		//
		fis.close();
		
	}	

}
