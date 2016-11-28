package com.study.day25_GUI;

import java.awt.Frame;

/**
 *	GUI:
 *		graphic user interface ͼ���û��ӿ�
 *			��ͼ�εķ�ʽ����ʾ������Ĳ������棬����������ֱ�ۡ�
 *		JavaΪGUI�ṩ�Ķ��󶼴���java.Awt��Javax.Swing��������
 *		java.Awt��
 *			 Abstract Window Toolkit ���󴰿ڹ��߰�
 *			  ��Ҫ���ñ���ϵͳ����ʵ�ֹ��ܣ������������Ŀؼ�
 *		javax.Swing:
 *			��awt�Ļ����ϣ�������һ��ͼ�ν���ϵͳ�������ṩ�˸���������������ȫ��Javaʵ�֣���ǿ����ֲ�ԣ�
 *			�����������ؼ�
 *	CLI:
 *		Command line user interface �������û��ӿ�
 *			���ǳ�����Dos���������Linux�µ�shell���
 *			��Ҫ����һЩ�����������ֱ�ۡ�
 */
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame();
		//����һ���������ô���ɼ�
//		f.show();
		f.setVisible(true);
		
		System.out.println("hello,world!");
	}

}
