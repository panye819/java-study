package com.study.day22_IO;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * ��ӡ��
 * 	�ֽڴ�ӡ��
 * 		PrintStream
 * 	�ַ���ӡ��	
 *		PrintWriter
 *	��ӡ�����ص㣺
 *		1��ֻ��д���ݵģ�û�ж�ȡ���ݣ�ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ
 *		2�����Բ����������͵�����
 *		3������������Զ�ˢ�£��Ϳ����Զ�ˢ��
 *		4�������ǿ���ֱ�Ӳ����ı��ļ���
 *
 *�����Է�Ϊ��
 *		1����������
 *			���ǿ���ֱ�Ӳ����ı��ļ���
 *		2���߼�����
 *			�ڻ������Ļ������ṩ��һЩ�����ĸ߼�����
 *�鿴API���鿴������Ĺ��췽�������ͬʱ����File��String���͵Ĳ�����һ����˵�ǿ���ֱ�Ӳ����ı��ļ��ġ�
 */
public class PrintDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("pw.txt");
		
		pw.write("hello");
		pw.write("world");
		pw.write("java");
		
		pw.close();
	}

}
