package com.study.day20_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * ���������ж�ʲôʱ��ð������ַ�ƴ�ӳ������أ�
 * 	�����ص��ֽ������Ԫ��Ϊ��ֵʱ��ƴ�ӣ�������ƴ��
 * 		
 * 
 *
 */
public class FileInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fos = new FileOutputStream("IODemo2\\a2.txt");
//		FileInputStream fis = new FileInputStream("IODemo\\a2.txt");
//		
//		int by = 0;
//		while((by=fis.read()) != -1){
//			
//			fos.write(by);
//		}
//		
//		fis.close();
//		fos.close();
		
		
		String s1 = "abcdefg";
		
		System.out.println(Arrays.toString(s1.getBytes()));
		
		String s2 = "�Ұ����й�";
		System.out.println(Arrays.toString(s2.getBytes()));
	}	
	
	

}
