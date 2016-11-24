package com.study.day20_IO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���������Լӿ����ݵĴ��䣬����ÿ���ֽڶ�ȥ����ϵͳ����
 * BufferedOutputStream
 * BufferedInputStream
 *���췽�����Ըı仺������С������Ĭ�ϵĻ������㹻����
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
