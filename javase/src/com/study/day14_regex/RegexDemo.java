package com.study.day14_regex;

import java.util.Scanner;

/**
 * 	需求：
 * 		判断QQ号是否合法：
 * 			1、长度在5~15位之间
 * 			2、0不能开头
 * 		
 *
 */
public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要验证的QQ号：");
		String qq = sc.nextLine();
		
		checkQQ(qq);
		

	}
	public static boolean checkQQ(String qq){
		boolean flag = true;
		
			if(qq.length()>=5 && qq.length()<=15){
				if(!qq.startsWith("0")){
				char[] chs = qq.toCharArray();
				for(int x=0;x<chs.length;x++){
					if(!Character.isDigit(chs[x])){
						System.out.println("你输入的QQ号有误，请确认后重试。");
						break;
						}
				}	
			}else{
				System.out.println("QQ号不可以以0开头");
				}
		}else{
			System.out.println("你输入的QQ长度错误，请确认后重试。");
		}
			return flag;
	}
}
