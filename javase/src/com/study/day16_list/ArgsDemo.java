package com.study.day16_list;

/**
 * �ɱ������
 * 		���巽��ʱ�޷�ȷ�������ĸ���
 * ��ʽ��
 * 	���η� ����ֵ���� ������(��������... ������){	
 * }
 *	����ı�����ʵ��һ������
 *	���һ������ �пɱ�������ǿɱ����һ�������һ��
 */
public class ArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		numSum(a, b);
		int result = sum(a,b);
		System.out.println("result is :"+result);
		int c =40;
		result = sum(a,b,c);
		System.out.println("result is :"+result);
		
		int d =100;
		result = sum(a,b,c,d);
		System.out.println("result is :"+result);
	}

		
	private static void numSum(int a, int b) {
		int result = a+b;
	}
	public static int sum(int... a){
		int s = 0;
		for(int x :a){
			s +=x;
		}
		return s;
		
		
		
	}
}
