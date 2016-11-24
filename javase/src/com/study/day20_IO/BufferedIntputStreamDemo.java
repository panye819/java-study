package com.study.day20_IO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
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
public class BufferedIntputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IODemo\\bos.txt"));
//		int by = 0;
//		while((by=bis.read()) != -1){
//			System.out.print((char)by);
//			
//		}
	
		byte[] by = new byte[1024];
		int len = 0;
		
		while((len=bis.read(by)) != -1){
			System.out.print(new String(by, 0, len) );
		}
		bis.close();
		
	
	}
	

}
