package com.study.day20_IO;

import java.io.BufferedOutputStream;
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
public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IODemo\\bos.txt"));
		
		bos.write("hello".getBytes());
		
		bos.close();
		
	
	}
	

}
