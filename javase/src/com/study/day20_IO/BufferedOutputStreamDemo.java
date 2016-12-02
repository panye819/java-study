package com.study.day20_IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲区可以加快数据的传输，不用每个字节都去调用系统功能
 * BufferedOutputStream
 * BufferedInputStream
 *构造方法可以改变缓冲区大小，但是默认的缓冲区足够大了
 *
 */
public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IODemo\\bos.txt"));
		
		bos.write("hello".getBytes());
		
		bos.close();
		
	
	}
	

}
