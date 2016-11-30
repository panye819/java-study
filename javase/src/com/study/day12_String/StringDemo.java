package com.study.day12_String;

/**
 *	字符串：
 *		一串字符组成的数据。
 *		字符串是常量，一旦赋值就不会被改变,这里的值不是地址值
 *		一旦重新赋值，就是一个新的对象。
 */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abc");
		String s1 = "abc";
		System.out.println(s+"---"+s1);
		System.out.println("----------------------");	
		String s2 = "hello";
		s2 += "world";
		System.out.println("s2 ： "+s2);
		System.out.println("----------------------");		
		//下面二种定义方法是有区别的。
			
		String s4 = "hello";//至少创建一个对象。
		String s5 = new String("hello");//至少创建2个对象。

		System.out.println(s4);
		System.out.println(s5);
	}

}
