package com.study.day13_Integer_Character;

/**
 *	JDK5的新特性：
 *		自动装箱：把基本类型转换为包装类类型
 *		自动拆箱：把包装类类型转换为基本类型
 *	如果对null拆装箱，会报NullPointerException异常
 */
public class IntegerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = 100;
		
		i += 200;
		System.out.println("i: "+i);
		
		//NullPointerException
//		Integer ii = null;
		Integer ii = 100;
		ii += 1000;
		System.out.println("ii : "+ii);
	}

}
