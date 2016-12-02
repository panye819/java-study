package com.study.day22_IO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 可以启动自动刷新，但必须是println.printf或format方法才会自动刷新缓存区
 *
 */
public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		PrintWriter pw = new PrintWriter("pw2.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"), true);
		
//		pw.print(true);
//		pw.print(12.34);
//		pw.print(1.234);
//		pw.print(100000000000L);
		pw.println(true);
		pw.println(12.34);
		pw.println(1.234);
		pw.println(100000000000L);


		pw.close();
		
		
	}

}
