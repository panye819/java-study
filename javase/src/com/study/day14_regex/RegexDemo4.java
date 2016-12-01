package com.study.day14_regex;

import java.util.Scanner;

/**
 * 正则表达式的分割功能
 * 	
 *
 */
public class RegexDemo4 {

	public static void main(String[] args) {
		String s = "com.study.day07_01_variable";
		
		String regex = "\\.";
		
		String[] strArr = s.split(regex);
//		for(int x=0;x<strArr.length;x++){
//			System.out.print(strArr[x]+",");
//		}
		for(String x :strArr){
			System.out.println(x);
		}

	}
}
