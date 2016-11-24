package com.study.day21_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * BufferedWriter:
 * 		将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入
 * 		
 */
public class BufferedReaderDemo {

	
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		// TODO Auto-generated method stub
		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("IODemo\\bw.txt")));
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
//		int by = 0;
//		while((by=br.read()) != -1){
//			System.out.print((char)by);
//		}
		//方式二
		
		char[] chs = new char[1024];
		int by = 0;
		while((by=br.read(chs)) !=-1){
			System.out.print(new String(chs,0,by));
		}
		
		br.close();

	}

}
