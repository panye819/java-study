package com.study.day14_math;

import java.util.Scanner;

/**
 * 	���һ�����������Եõ����ⷶΧ��һ�������
 * 		
 *
 */
public class MathDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ȡ��������ķ�Χ���ޣ�");
		int start = sc.nextInt();
		System.out.println("��������Ҫ��ȡ��������ķ�Χ���ޣ�");
		int end = sc.nextInt();
		for(int x =0;x<100;x++){
			int result = generateRandom(start,end);
			System.out.println("The random number is : "+result);
		}
		
		
		
		
	}
	public static int generateRandom(int start,int end){
		//ģ������1~100֮��������
//		int rand = (int) ((Math.random()*100)+1);
		int randNum = (int)(Math.random()*(end-start+1)+start);
		return randNum;
		
	}
}
