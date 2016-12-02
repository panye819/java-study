package com.study.day05_array;

import java.util.Scanner;

/*
 * ����
 * 		ĳ����˾���õ绰����������Ϣ��������С��8Ϊ��������Ϊ�˰�ȫ����Ҫ���ܣ����ܹ�������
 * 			���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����ó���10���������������
 * 			��󽫵�һλ�����һλ���ֽ�����
 * 		���������һ��С��8λ��������Ȼ��������ܺ�Ľ��
 * ������
 * 		1��������С��8λ������
 * 		2����������
 * 		3���������
 * 			
 * �ѵ����ڽ�int����ת��Ϊ����
 * 
 */
public class ArrayDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��8λ���ڵ���Ҫ���ܵ����ݣ�");
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
		System.out.println("���ܺ������Ϊ��"+s);
	}
}
