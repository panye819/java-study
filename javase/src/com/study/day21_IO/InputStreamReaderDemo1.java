package com.study.day21_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter(OutputStream os)������Ĭ�ϱ����ʽ���ֽ���ת�����ַ���
 * InputStreamWriter(OutputStream os��String charsetName)������ָ���ı����ʽ���ֽ���ת�����ַ���
 *	�ַ���=�ֽ���+�����
 */
public class InputStreamReaderDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��������
		InputStreamReader isr = new InputStreamReader(new FileInputStream("IODemo\\a.txt"));
//		osw.write("�й�����!");
//		System.out.println(osw);
		
		int ch = 0;

		while((ch=isr.read()) != -1){
			System.out.print((char)ch);

		}
		//
		isr.close();
	}

}
