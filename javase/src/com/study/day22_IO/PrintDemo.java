package com.study.day22_IO;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 打印流
 * 	字节打印流
 * 		PrintStream
 * 	字符打印流	
 *		PrintWriter
 *	打印流的特点：
 *		1、只有写数据的，没有读取数据，只能操作目的地，不能操作数据源
 *		2、可以操作任意类型的数据
 *		3、如果启动了自动刷新，就可以自动刷新
 *		4、该流是可以直接操作文本文件的
 *
 *流可以分为：
 *		1、基本流：
 *			就是可以直接操作文本文件的
 *		2、高级流：
 *			在基本流的基础上提供了一些其他的高级功能
 *查看API，查看流对象的构造方法，如果同时具有File和String类型的参数，一般来说是可以直接操作文本文件的。
 */
public class PrintDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("pw.txt");
		
		pw.write("hello");
		pw.write("world");
		pw.write("java");
		
		pw.close();
	}

}
