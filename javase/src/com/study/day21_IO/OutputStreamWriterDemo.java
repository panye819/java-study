package com.study.day21_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter(OutputStream os)������Ĭ�ϱ����ʽ���ֽ���ת�����ַ���
 * InputStreamWriter(OutputStream os��String charsetName)������ָ���ı����ʽ���ֽ���ת�����ַ���
 *	�ַ���=�ֽ���+�����
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IODemo\\a.txt"));
		osw.write("�й�����!");
//		System.out.println(osw);
		osw.close();
	}

}
