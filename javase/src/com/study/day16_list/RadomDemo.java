package com.study.day16_list;

import java.util.ArrayList;
import java.util.Random;

/**
 * ��ȡ10��1��20֮����������Ҫ�����ظ�
 * �ü���ʵ��
 * 	������
 * 		1����������������Ķ���
 * 		2������һ���洢������ļ���
 * 		3������һ��ͳ�Ʊ�������0��ʼ
 * 		4���ж�ͳ�Ʊ����Ƿ�С��10
 * 			С��10�Ͳ���һ����������жϸ�������ڼ������Ƿ����
 * 				�����ھ���ӣ�ͳ�Ʊ���++
 * 				���ھ�����
 * 			�����С��10������ѭ��
 * 		5����������
 *
 */
public class RadomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1����������������Ķ���
		Random r = new Random();
		//2������һ���洢������ļ���
		ArrayList <Integer>arr = new ArrayList<Integer>();
		//3������һ��ͳ�Ʊ�������0��ʼ
		int count = 0;
		//4�ж�ͳ�Ʊ����Ƿ�С��10
		while(count<10){
			int num = r.nextInt(20);
			if(!arr.contains(num)){
				arr.add(num);
				count++;
			}
		}
		for(Integer a:arr){
			System.out.println(a);
		}
		}
		
		
	}

