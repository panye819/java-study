package com.study.day21_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter(OutputStream os)：按照默认编码格式将字节流转换成字符流
 * InputStreamWriter(OutputStream os，String charsetName)：按照指定的编码格式将字节流转换成字符流
 *	字符流=字节流+编码表
 *
 *	close方法会强制刷新
 */
public class OutputStreamWriterDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IODemo\\osw2.txt"));
//		osw.write("中国加油!");
//		osw.write("China加油");
		
		//write 
//		osw.write("97");
//		osw.write("a");
		//
		char[] chs = {'a','b','c','d','e',};
//		osw.write(chs);
		
		//
//		osw.write(chs, 0, 3);
		
		//
		String s = "abcdefg";
		osw.write(s, 2, 4);
//		osw.flush();
//		System.out.println(osw);
		osw.close();
	}

}
