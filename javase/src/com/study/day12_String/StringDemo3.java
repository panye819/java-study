package com.study.day12_String;

/**
 * 	�ַ����Ļ�ȡ����
 * 		
 */
public class StringDemo3 {

	public static void main(String[] args) {
		String s = "abc";
		String s1 = "ABC";
		String s2 = "abcdefee";
		String s4 = "";
		
		//��ȡ����
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf('a'));//����ָ���ַ����ַ����е�һ�γ��ֵ�λ�ã����ﷵ��ֵ��int����Ϊascii���У��ַ�Ҳ����ת��Ϊ����
		System.out.println(s2.indexOf("d"));//����ָ���ַ��������ַ����е�һ�γ��ֵ�λ��
		System.out.println(s2.indexOf('e',5));//����ָ���ַ������ַ�����ָ������ֵ֮���һ�γ��ֵ�λ��
		System.out.println(s2.substring(2));//�����ַ�����ָ��������λ�õ������ַ���
		System.out.println(s2.substring(1, 3));//�����ַ����ڶ�������ֵ֮����ַ�����ǰ������
		
		
		
		
	}

}
