package com.study.day12_String;

/**
 * 	�������ܣ�
 * 		�滻���ܣ�
 * 			String replace(char old,char new)
 * 			String replace(String old,String new)
 * 		ȥ���ַ������˿ո�
 * 			String trim()
 * 		���ֵ�˳��Ƚ��ַ���
 * 			int compareTo(String str)
 * 			int compareToIgnortCase(String str)
 */
public class StringDemo7 {

	public static void main(String[] args) {
		String s = "Hello123World";
		
		System.out.println(s.replace("Hello", "heLLo"));
		
		String s4 = "   Hello  123  World   ";
		System.out.println(s4.trim());
		
		String s2 = "HELLO123WORLD";
		
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareToIgnoreCase(s2));
	}

}
