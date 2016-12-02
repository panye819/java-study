package com.study.day16_list;

import java.util.ArrayList;
import java.util.Random;

/**
 * 获取10个1～20之间的随机数，要求不能重复
 * 用集合实现
 * 	分析：
 * 		1、创建产生随机数的对象
 * 		2、创建一个存储随机数的集合
 * 		3、定义一个统计变量，从0开始
 * 		4、判断统计遍历是否小于10
 * 			小于10就产生一个随机数，判断该随机数在集合中是否存在
 * 				不存在就添加，统计变量++
 * 				存在就跳过
 * 			如果不小于10就跳出循环
 * 		5、遍历集合
 *
 */
public class RadomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1、创建产生随机数的对象
		Random r = new Random();
		//2、创建一个存储随机数的集合
		ArrayList <Integer>arr = new ArrayList<Integer>();
		//3、定义一个统计变量，从0开始
		int count = 0;
		//4判断统计遍历是否小于10
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

