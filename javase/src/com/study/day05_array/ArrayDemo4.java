package com.study.day05_array;

import java.util.Scanner;

/**
 * ��ӡ�������
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3  1
 * 1 4 6  4  1
 * 1 5 10 10 5 1
 * 1 6 15 20 15 6 1
 *	������ÿһ�еĵ�һ���к����һ�ж���1
 *		�ӵ����п�ʼ��ÿһ��������һ�е�ǰһ�кͱ��е�ֵ�ĺ�
 *	���裺
 *		1������һ����������������n�Ķ�ά���飬n�ɼ���¼��
 *		2����ÿһ��һά����ĵ�һ��Ԫ�غ����һ��Ԫ�ظ�ֵΪ1
 *		3��������Ԫ�ؽ��и�ֵ
 *			�ӵ����п�ʼ��ÿһ��������һ�е�ǰһ�кͱ��е�ֵ�ĺ�
 *		4����������
 */
public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ��������ǵ�������");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		for(int x=0;x<arr.length;x++){
			arr[x][0] = 1;
			arr[x][x] = 1;
			
			}
		//�ӵ����п�ʼ��ÿһ��������һ�е�ǰһ�кͱ��е�ֵ�ĺ�,ע��x,y�ĳ�ʼֵ����Χ����
		for(int x=2;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
				arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
			}
		}
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println("");
		}
	
	}
}
