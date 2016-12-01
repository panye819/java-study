package com.study.day05_array;

import java.util.Scanner;

/*
 * 需求：
 * 		某个公司采用电话传递数据信息，数据是小于8为的整数，为了安全，需要加密，加密规则如下
 * 			首先将数据倒序，然后将每位数字都加上5，在用除以10的余数代替该数字
 * 			最后将第一位和最后一位数字交换。
 * 		请任意给定一个小于8位的正数，然后输出加密后的结果
 * 分析：
 * 		1、数据是小于8位的整数
 * 		2、加密数据
 * 		3、输出数据
 * 			
 * 难点在于将int变量转换为数组
 * 
 */
public class ArrayDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个8位以内的你要加密的数据：");
		int number = sc.nextInt();
		encryptMethod(number);	
		sc.close();
	}
	public static void encryptMethod(int number){
		int[] arr = new int[8];
		int index = 0;
		
		while(number>0){
			arr[index] = number%10;
			index++;
			number /=10;
		}
	
		for(int x=0;x<index;x++){
			arr[x] = (arr[x]+5)%10;
		}
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;
		
		String s = "";
		for(int x=0;x<index;x++){
			s += arr[x];
		}
//		return s;
		System.out.println("加密后的数据为："+s);
	}
}
