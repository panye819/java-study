package com.study.day14_math;

import java.util.Random;

/**
 *	Random��
 *		�������������
 * 		���췽����
 * 			public Random():û�и����ӣ��õ���Ĭ�����ӣ��ǵ�ǰʱ��ĺ���ֵ
 *			public Random(long seed):����ָ��������,�������Ӻ�ÿ�εõ������������ͬ�ġ�
 *		
 * 		��Ա������
 * 			public int nextInt()�����ص���int��Χ�ڵ������
 *			public int nextInt(int n):���ص���[0,n)��Χ���������
 *		
 */
public class RandomDemo {

	public static void main(String[] args) {
		
		Random r = new Random();
		for(int x=0;x<10;x++){
			System.out.println("random number is : "+r.nextInt());;
		}
		System.out.println("----------------------");
		for(int x=0;x<10;x++){
			System.out.println("random number is : "+r.nextInt(100));;
		}

	}

}
