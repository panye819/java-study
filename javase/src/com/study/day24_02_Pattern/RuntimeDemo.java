package com.study.day24_02_Pattern;

import java.io.IOException;

/**
 *	Runtime��
 *		ÿ��Java������һ��Runtime��ʵ����ʹӦ�ó����ܹ��������еĻ���������
 *
 *
 */
public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
//		rt.exec("msconfig");
		rt.exec("notepad");
	}
}
