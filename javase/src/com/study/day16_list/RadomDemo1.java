package com.study.day16_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 

/**
 *从键盘录入多个数据，以0结束，要求在控制台输出这些数的最大值
 *分析：
 *	1、创建键盘录入对象
 *	2、创建一个集合用于存储键盘录入对象
 *	3、开始键盘录入，当输入为0是，结束输入
 *	4、将集合转换成数组，利用sort方法排序
 *	5、取出最大索引值的数，即为最大值
 *
 */
public class RadomDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//创建集合
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//开始键盘录入，当输入为0时，结束输入
		while(true){
			System.out.println("请输入数据........");
			int number = sc.nextInt();
			if(number != 0){
				arr.add(number);
			}else{
				System.out.println("输入结束......");
				break;
			}
		
			
		}
		//将集合转换成数组
		Integer[] i = new Integer[arr.size()];
		arr.toArray(i);
		Arrays.sort(i);
		
		System.out.println("The max number of your input is : "+i[i.length-1]);
		}
		
		
}

