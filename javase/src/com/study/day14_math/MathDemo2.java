package com.study.day14_math;

import java.util.Scanner;

/**
 * 	设计一个方法，可以得到任意范围的一个随机数
 * 		
 *
 */
public class MathDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要获取的随机数的范围下限：");
		int start = sc.nextInt();
		System.out.println("请输入你要获取的随机数的范围上限：");
		int end = sc.nextInt();
		for(int x =0;x<100;x++){
			int result = generateRandom(start,end);
			System.out.println("The random number is : "+result);
		}
		
		
		
		
	}
	public static int generateRandom(int start,int end){
		//模仿生成1~100之间的随机数
//		int rand = (int) ((Math.random()*100)+1);
		int randNum = (int)(Math.random()*(end-start+1)+start);
		return randNum;
		
	}
}
