package com.study.day12_String;

/**
 * 	�ַ������жϹ���
 * 		
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String s = "abc";
		String s1 = "ABC";
		String s2 = "abcdef";
		String s4 = "";
		
		//�жϹ���
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s2.contains(s));
		System.out.println(s.startsWith("a"));
		System.out.println(s.startsWith("b"));
		System.out.println(s.endsWith("c"));
		System.out.println(s2.endsWith("c"));
		System.out.println(s2.isEmpty());
		System.out.println(s4.isEmpty());
		
		
		
		
	}

}
