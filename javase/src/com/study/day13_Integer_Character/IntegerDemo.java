package com.study.day13_Integer_Character;

/**
 * 	需求：
 * 		写出数字100的二进制，八进制，十六进制
 * 	将基本数据类型封装成对象，可以在对象中定义更多的功能方法操作该数据。
 * 	byte           Byte
 * 	short          Short
 * 	int            Integer
 * 	long           Long
 * 	float          Float
 * 	double         Double
 * 	char           Character
 * 	boolean        Boolean
 * 	常用的操作之一就是用于基本数据类型和字符串之间的转换。
 *
 */
public class IntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.toBinaryString(100));//二进制
		System.out.println(Integer.toOctalString(100));//八进制
		System.out.println(Integer.toHexString(100));//十六进制
		System.out.println("-------------");
		System.out.println(Integer.MAX_VALUE);//int的最大值
		System.out.println(Integer.MIN_VALUE);//int的最小值
		System.out.println("-------------");	
		System.out.println(Byte.MAX_VALUE);//byte的最大值
		System.out.println(Byte.MIN_VALUE);//byte的最小值
		System.out.println("-------------");
		String  s1 = "100";
		String  s2 = "abc";
		
		Integer ii = new Integer(s1);
		System.out.println("ii:"+ii);
		System.out.println("-------------");
		//
		//要转换的字符串必须是由数字组成,否则就会报NumberFormatException错误
//		Integer iii = new Integer(s2);
//		System.out.println("iii:"+iii);
		
		String s3 = "100";
		int i3 = Integer.parseInt(s3);
		System.out.println("i3: "+i3);
		System.out.println("-------------");
		float f1 = Float.parseFloat(s3);
		System.out.println("f1: "+f1);
		System.out.println("-------------");
		double d1 = Double.parseDouble(s3);
		System.out.println("d1: "+d1);
		System.out.println("-------------");
		//进制的范围是2~36
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, 7));
		System.out.println(Integer.toString(100, 1));
		System.out.println(Integer.toString(100, 37));
		
		//其他进制到十进制
		
	}

}
