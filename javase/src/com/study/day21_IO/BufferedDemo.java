package com.study.day21_IO;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符缓冲流的特殊方法
 * 	BufferedWriter：
 * 		public void newLine():根据系统来决定换行符
 * 	BufferedReader：
 * 		public void readLine():一次读取一行数据
 * 
 * 
 * 		
 */
public class BufferedDemo {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));
		BufferedReader br = new BufferedReader(new FileReader("c.txt"));
		
		bw.write("hello");
		bw.newLine();
		bw.write("world");
		bw.newLine();
		bw.write("java");
		bw.newLine();
		bw.close();
		
		
//		int by = 0;
//		while((by=br.read()) != -1){
//			System.out.print((char)by);
//		}
		//方式二
//		
//		char[] chs = new char[1024];
//		int by = 0;
//		while((by=br.read(chs)) !=-1){
//			System.out.print(new String(chs,0,by));
//		}
//		
		String len = null;
		while((len=br.readLine()) != null){
			System.out.println(len);
		}

		br.close();

	}

}
