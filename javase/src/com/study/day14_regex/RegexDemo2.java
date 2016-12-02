package com.study.day14_regex;

import java.util.Scanner;

/**
 * 	正则表达式：
 * 		是指一个用来描述或匹配一系列符合某个句法规则的字符串的字符。
 * 
 * 
 * 
 * 
 * 	需求：
 * 		判断QQ号是否合法：
 * 			1、长度在5~15位之间
 * 			2、0不能开头
 * 		
 *
 */
public class RegexDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要验证的QQ号：");
		String qq = sc.nextLine();
		
		checkQQ(qq);
		

	}
	public static boolean checkQQ(String qq){
		String regex = "[1-9][0-9]{4,14}";
		boolean flag = qq.matches(regex);
		System.out.println("result: "+flag);
		return flag;
	}
}
