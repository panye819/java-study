package com.study.day21_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter(OutputStream os)������Ĭ�ϱ����ʽ���ֽ���ת�����ַ���
 * InputStreamWriter(OutputStream os��String charsetName)������ָ���ı����ʽ���ֽ���ת�����ַ���
 *	�ַ���=�ֽ���+�����
 *
 *	close������ǿ��ˢ��
 */
public class OutputStreamWriterDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IODemo\\osw2.txt"));
//		osw.write("�й�����!");
//		osw.write("China����");
		
		//write 
//		osw.write("97");
//		osw.write("a");
		//
		char[] chs = {'a','b','c','d','e',};
//		osw.write(chs);
		
		//
//		osw.write(chs, 0, 3);
		
		//
		String s = "abcdefg";
		osw.write(s, 2, 4);
//		osw.flush();
//		System.out.println(osw);
		osw.close();
	}

}
