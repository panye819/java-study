package com.study.day12_String;

/**
 * 	字符串的获取功能
 * 		
 */
public class StringDemo3 {

	public static void main(String[] args) {
		String s = "abc";
		String s1 = "ABC";
		String s2 = "abcdefee";
		String s4 = "";
		
		//获取功能
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf('a'));//返回指定字符在字符串中第一次出现的位置，这里返回值是int，因为ascii表中，字符也可以转换为数字
		System.out.println(s2.indexOf("d"));//返回指定字符串，在字符串中第一次出现的位置
		System.out.println(s2.indexOf('e',5));//返回指定字符，在字符串中指定索引值之后第一次出现的位置
		System.out.println(s2.substring(2));//返回字符串从指定的索引位置到最后的字符串
		System.out.println(s2.substring(1, 3));//返回字符串在二个索引值之间的字符，含前不含后。
		
		
		
		
	}

}
