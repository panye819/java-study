package com.study.day20_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * һ�ζ�ȡһ���ַ�����
 *
 */
public class FileInputStreamDemo3 {

	public static void main(String[] args) throws IOException {
		//�������
		FileInputStream fis = new FileInputStream("IODemo\\fis2.txt");
		//
		
		byte[] bys = new byte[5];
		int len = fis.read(bys);
		System.out.println(len);
		
		
		//�ͷ���Դ
		fis.close();
		
		
		
		
		
		
		
	}	
}
