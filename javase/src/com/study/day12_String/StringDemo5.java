package com.study.day12_String;

/**
 * 	需求：统计给定的字符串中，大写字母，小写字母，数字的个数
 * 		
 * 		
 */
public class StringDemo5 {

	public static void main(String[] args) {
		String s = "Hello123World";
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;
		
		for(int x=0;x<s.length();x++){
			char ch = s.charAt(x);
			if(ch>'a' && ch<'z'){
				smallCount++;
			}else if(ch>'A' && ch<'Z'){
				bigCount++;
			}else if(ch>'0' && ch <'9'){
				numCount++;
			}
		}
		System.out.println(bigCount);
		System.out.println(smallCount);
		System.out.println(numCount);
	}

}
