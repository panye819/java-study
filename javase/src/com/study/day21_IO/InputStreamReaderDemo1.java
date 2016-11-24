package com.study.day21_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter(OutputStream os)：按照默认编码格式将字节流转换成字符流
 * InputStreamWriter(OutputStream os，String charsetName)：按照指定的编码格式将字节流转换成字符流
 *	字符流=字节流+编码表
 */
public class InputStreamReaderDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建对象
		InputStreamReader isr = new InputStreamReader(new FileInputStream("IODemo\\a.txt"));
//		osw.write("中国加油!");
//		System.out.println(osw);
		
		int ch = 0;

		while((ch=isr.read()) != -1){
			System.out.print((char)ch);

		}
		//
		isr.close();
	}

}
