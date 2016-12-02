package com.study.day05_array;

import java.util.Scanner;

/**
 *	数组是存储多个变量（元素）的东西（容器）
 *		其中多个变量的数据类型要一致
 *	定义格式：
 *		数组类型[] 数组名 = new 数组类型[数组长度]
 *		数组类型[] 数组名 = {数组元素......}
 *	初始化：
 *		就是为数组中的数组元素分配地址空间，并为每个数组元素赋值
 *		初始化方式：
 *			1、动态初始化：初始化时只指定数组的长度，由系统去分配初始化值
 *			2、静态初始化：初始化时指定数组元素的初始化值，长度由系统去决定		
 *	Java为了提高程序的效率，对数据进行了不同空间的划分：
 *		栈：存放的是局部变量
 *			特点：
 *				数据用完就释放掉
 *		堆：存放的是所有new出来的对象
 *			特点：
 *				a、每一个new出来的对象都有地址值
 *				b、每个变量都有默认值：
 *					byte,short,int,long 0
 *					float,double 0.0
 *					boolean false
 *					引用类型 null
 *				c、使用完毕就变成垃圾，但是没有立即回收，会在垃圾回收器空闲的时候回收。
 *		方法区：面向对象详细讲解
 *		本地方法区：与系统相关
 *		寄存区：cpu使用。
 *	
 *
 */		
 
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = {89,22,43,32,5,13,2222,1,0};
//		maxOfArray(arr);
//		minOfArray(arr);
//		System.out.println("逆序前的数组：");
//		printArray(arr);
////		reverseArray(arr);
////		System.out.println("逆序后的数组：");
////		printArray(arr);
//		System.out.println("采用reverse2逆序之后的数组：");
//		reverse2Array(arr);
//		printArray(arr);
//		findElement(arr);
		findElementFirst(arr);
	}	
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x == arr.length-1){
				System.out.println(arr[x]+"]");
			}else{
				System.out.print(arr[x]+",");
			}
		}
		}
	public static void maxOfArray(int[] arr){
		int max = arr[0];
		for(int x=1;x<arr.length;x++){
			if(arr[x]>max){
				max = arr[x];
			}
		}
		System.out.println("The Bigest number in arr is : "+max);
	}
	public static void minOfArray(int[] arr){
		int min = arr[0];
		for(int x=1;x<arr.length;x++){
			if(arr[x]<min){
				min = arr[x];
			}
		}
		System.out.println("The Samllest number in arr is : "+min);
	}
	public static void reverseArray(int[] arr){
		for(int x=0;x<arr.length/2;x++){
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
	public static void reverse2Array(int[] arr){
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	public static void findElement(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出你要查找的元素的索引值：");
		int x = sc.nextInt();
		if(x<arr.length){
			System.out.println("索引"+x+"对应的元素是： "+arr[x]);
		}else{
			System.out.println("你提供的索引是非法的，请确认后重新输入");
		}
		sc.close();
		
	}
	public static int findElementFirst(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出你要查找的元素：");
		int find = sc.nextInt();
		for(int x=0;x<arr.length;x++){
			if(arr[x] == find){
				System.out.println("你查找的元素的索引值是： "+x);
				return 0;
			}
//			System.out.println("你输入的元素未找到，请确认后重试！");
		}
		sc.close();
		return -1;
		
	}
}
