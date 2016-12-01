package com.study.day14_math;

import java.util.Random;

/**
 *	Random：
 *		产生随机数的类
 * 		构造方法：
 * 			public Random():没有给种子，用的是默认种子，是当前时间的毫秒值
 *			public Random(long seed):给出指定的种子,给定种子后，每次得到的随机数是相同的。
 *		
 * 		成员方法：
 * 			public int nextInt()：返回的是int范围内的随机数
 *			public int nextInt(int n):返回的是[0,n)范围的内随机数
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
