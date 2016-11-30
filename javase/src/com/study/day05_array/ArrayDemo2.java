package com.study.day05_array;

/**
 * 二维数组
 * 	其实就是一个元素为一维数组的数组
 * 	定义格式：
 * 		1、数据类型[][] 二维数组名 = new 数据类型[m][n]
 * 			m代表有几个一维数组元素
 * 			n代表一维数组的长度
 * 		2、数据类型[][] 二维数组名 = new 数据类型[m][]
 * 			这种格式没有n值，表示一维数组的个数没有指定，可以动态给出。
 * 			说明列是可以变化的。
 * 		3、数据类型[][] 二维数组名 = new 数据类型[][]{{元素......},{元素......},{元素......},{元素......}}
		也可以写成：
 			数据类型[][] 二维数组名 = 数据类型{{元素......},{元素......},{元素......},{元素......}}
  */	
public class ArrayDemo2 {
	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println("-----------");
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);
		System.out.println("------这是分割线------");
		
		int[][] arr2 = new int[4][];
		arr2[0] = new int[3];
		arr2[1] = new int[4];
		arr2[2] = new int[1];
		arr2[3] = new int[2];
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println("-----------");
		System.out.println(arr2[0][2]);
		System.out.println(arr2[1][2]);
		System.out.println(arr2[2][0]);
		System.out.println(arr2[3][1]);
		System.out.println("------这是分割线------");
		int[][] arr3 = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println("-----------");
		System.out.println(arr3[0][2]);
		System.out.println(arr3[1][1]);
		System.out.println(arr3[2][3]);
	}
}
