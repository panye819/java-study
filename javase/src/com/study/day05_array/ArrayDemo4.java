package com.study.day05_array;

import java.util.Scanner;

/**
 * 打印杨辉三角
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3  1
 * 1 4 6  4  1
 * 1 5 10 10 5 1
 * 1 6 15 20 15 6 1
 *	分析：每一行的第一个列和最后一列都是1
 *		从第三行开始，每一列是上面一行的前一列和本列的值的和
 *	步骤：
 *		1、创建一个行数和列数都是n的二维数组，n由键盘录入
 *		2、将每一个一维数组的第一个元素和最后一个元素赋值为1
 *		3、对其他元素进行赋值
 *			从第三行开始，每一列是上面一行的前一列和本列的值的和
 *		4、遍历数组
 */
public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要打印的杨辉三角的行数：");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		for(int x=0;x<arr.length;x++){
			arr[x][0] = 1;
			arr[x][x] = 1;
			
			}
		//从第三行开始，每一列是上面一行的前一列和本列的值的和,注意x,y的初始值及范围问题
		for(int x=2;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
				arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
			}
		}
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println("");
		}
	
	}
}
