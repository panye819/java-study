package com.study.day21_IO;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * BufferedWriter:
 * 		���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд��
 * 		
 */
public class BufferedWriterDemo {

	
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		// TODO Auto-generated method stub
		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("IODemo\\bw.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter("IODemo\\bw.txt"));
		bw.write("hello");
		
		bw.close();

	}

}
