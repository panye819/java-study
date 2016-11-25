package com.study.day22_IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * �ڴ������
 * 	ByteArrayInputStream ����һ���ڲ����������û��������������ж�ȡ���ֽڡ��ڲ����������� read ����Ҫ�ṩ����һ���ֽڡ� 
 *		�ر� ByteArrayInputStream ��Ч�������еķ����ڹرմ������Կɱ����ã�����������κ� IOException��
 *  ByteArrayOutputStreamextends ʵ����һ������������е����ݱ�д��һ�� byte ���顣���������������ݵĲ���д����Զ�������
 * 		��ʹ�� toByteArray() �� toString() ��ȡ���ݡ� 
 * 		�ر� ByteArrayOutputStream ��Ч�������еķ����ڹرմ������Կɱ����ã�����������κ� IOException�� 
 */
public class ArrayStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for(int x=0;x<10;x++){
			baos.write(("hello"+x).getBytes());
		}
		
		byte[] bys = baos.toByteArray();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		
		int len = 0;
		while((len=bais.read()) != -1){
			System.out.print((char)len);
		}
	}

}
