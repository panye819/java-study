package com.study.day14_regex;

import java.util.Scanner;

/**
 * 
 * 	����
 * 		�ж������ʽ�Ƿ�Ϸ���
 *
 */
public class RegexDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��֤�������ַ��");
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
