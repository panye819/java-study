package com.study.day14_regex;

import java.util.Scanner;

/**
 * 	������ʽ��
 * 		��ָһ������������ƥ��һϵ�з���ĳ���䷨������ַ������ַ���
 * 
 * 
 * 
 * 
 * 	����
 * 		�ж�QQ���Ƿ�Ϸ���
 * 			1��������5~15λ֮��
 * 			2��0���ܿ�ͷ
 * 		
 *
 */
public class RegexDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��֤��QQ�ţ�");
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
