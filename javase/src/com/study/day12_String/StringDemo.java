package com.study.day12_String;

/**
 *	�ַ�����
 *		һ���ַ���ɵ����ݡ�
 *		�ַ����ǳ�����һ����ֵ�Ͳ��ᱻ�ı�,�����ֵ���ǵ�ֵַ
 *		һ�����¸�ֵ������һ���µĶ���
 */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abc");
		String s1 = "abc";
		System.out.println(s+"---"+s1);
		System.out.println("----------------------");	
		String s2 = "hello";
		s2 += "world";
		System.out.println("s2 �� "+s2);
		System.out.println("----------------------");		
		//������ֶ��巽����������ġ�
			
		String s4 = "hello";//���ٴ���һ������
		String s5 = new String("hello");//���ٴ���2������

		System.out.println(s4);
		System.out.println(s5);
	}

}
