package com.study.day16_list;

/**
 * 可变参数：
 * 		定义方法时无法确定参数的个数
 * 格式：
 * 	修饰符 返回值类型 方法名(数据类型... 变量名){	
 * }
 *	这里的变量其实是一个数组
 *	如果一个方法 有可变参数，那可变参数一定是最后一个
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
