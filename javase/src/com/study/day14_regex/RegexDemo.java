package com.study.day14_regex;

import java.util.Scanner;

/**
 * 	����
 * 		�ж�QQ���Ƿ�Ϸ���
 * 			1��������5~15λ֮��
 * 			2��0���ܿ�ͷ
 * 		
 *
 */
public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��֤��QQ�ţ�");
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
						System.out.println("�������QQ��������ȷ�Ϻ����ԡ�");
						break;
						}
				}	
			}else{
				System.out.println("QQ�Ų�������0��ͷ");
				}
		}else{
			System.out.println("�������QQ���ȴ�����ȷ�Ϻ����ԡ�");
		}
			return flag;
	}
}
