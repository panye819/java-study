package com.study.day14_regex;

import java.util.Scanner;

/**
 * 
 * 	需求：
 * 		判断邮箱格式是否合法：
 *
 */
public class RegexDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要验证的邮箱地址：");
		String mail = sc.nextLine();
		
		checkEmail(mail);
		

	}
	public static boolean checkEmail(String mail){
		String regex = "[a-zA-Z_0-9]+@[a-zA-Z0-9]{2,6}\\.[a-zA-Z0-9]{2,3}";
		boolean flag = mail.matches(regex);
		System.out.println("result: "+flag);
		return flag;
	}
}
