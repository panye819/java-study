package com.study.day20_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream
 * 	�����ȡ�������ݷ���ֵ��-1����˵����ȡ���ļ���ĩβ��
 * 
 *
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("IODemo\\a2.txt");
//		int by = fis.read();
//		//��һ�ζ�ȡ
//		System.out.println(by);
//		System.out.println((char)by);
//		//�ڶ��ζ�ȡ
//		 by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		//�����ζ�ȡ
//		 by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		//���Ĵζ�ȡ
//		 by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		while(by != -1){
//			System.out.print((char)by);
//			by = fis.read();
//		}
		int by = 0;
		while((by=fis.read())!= -1){
			System.out.print((char)by);
		}
		//
		fis.close();
		
	}	

}
