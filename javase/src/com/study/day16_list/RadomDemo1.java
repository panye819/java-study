package com.study.day16_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 

/**
 *�Ӽ���¼�������ݣ���0������Ҫ���ڿ���̨�����Щ�������ֵ
 *������
 *	1����������¼�����
 *	2������һ���������ڴ洢����¼�����
 *	3����ʼ����¼�룬������Ϊ0�ǣ���������
 *	4��������ת�������飬����sort��������
 *	5��ȡ���������ֵ��������Ϊ���ֵ
 *
 */
public class RadomDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//��������
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//��ʼ����¼�룬������Ϊ0ʱ����������
		while(true){
			System.out.println("����������........");
			int number = sc.nextInt();
			if(number != 0){
				arr.add(number);
			}else{
				System.out.println("�������......");
				break;
			}
		
			
		}
		//������ת��������
		Integer[] i = new Integer[arr.size()];
		arr.toArray(i);
		Arrays.sort(i);
		
		System.out.println("The max number of your input is : "+i[i.length-1]);
		}
		
		
}

