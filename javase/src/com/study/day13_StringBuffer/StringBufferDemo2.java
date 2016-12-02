package com.study.day13_StringBuffer;

/**
 * 	String ºÍ StringBuffer»¥×ª
 * 
 *		
 */
public class StringBufferDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		 StringBuffer sb  = new StringBuffer();
		 
		 sb.append(s);
		 System.out.println(sb);
		 System.out.println(sb.reverse());
		
		 String s2 = new String(sb);
		 System.out.println(s2);
	}

}
