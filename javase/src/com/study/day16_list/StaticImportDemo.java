package com.study.day16_list;

/**
 * 静态导入
 *	可以直接导入到方法级别。
 *	格式：
 *	import static 包名...类名....方法名
 *	注意事项：
 *	1、方法必须是静态的
 *	2、如果有多个同名的静态方法，那么要加前缀调用。
 */
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;



public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-100));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.max(20, 30));
		System.out.println("-------------");
		
		System.out.println(abs(-100));
		System.out.println(pow(2, 3));
		System.out.println(max(20, 30));
	}

}
