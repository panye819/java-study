package com.study.day05_array;

import java.util.Scanner;

/**
 *	�����Ǵ洢���������Ԫ�أ��Ķ�����������
 *		���ж����������������Ҫһ��
 *	�����ʽ��
 *		��������[] ������ = new ��������[���鳤��]
 *		��������[] ������ = {����Ԫ��......}
 *	��ʼ����
 *		����Ϊ�����е�����Ԫ�ط����ַ�ռ䣬��Ϊÿ������Ԫ�ظ�ֵ
 *		��ʼ����ʽ��
 *			1����̬��ʼ������ʼ��ʱָֻ������ĳ��ȣ���ϵͳȥ�����ʼ��ֵ
 *			2����̬��ʼ������ʼ��ʱָ������Ԫ�صĳ�ʼ��ֵ��������ϵͳȥ����		
 *	JavaΪ����߳����Ч�ʣ������ݽ����˲�ͬ�ռ�Ļ��֣�
 *		ջ����ŵ��Ǿֲ�����
 *			�ص㣺
 *				����������ͷŵ�
 *		�ѣ���ŵ�������new�����Ķ���
 *			�ص㣺
 *				a��ÿһ��new�����Ķ����е�ֵַ
 *				b��ÿ����������Ĭ��ֵ��
 *					byte,short,int,long 0
 *					float,double 0.0
 *					boolean false
 *					�������� null
 *				c��ʹ����Ͼͱ������������û���������գ������������������е�ʱ����ա�
 *		�����������������ϸ����
 *		���ط���������ϵͳ���
 *		�Ĵ�����cpuʹ�á�
 *	
 *
 */		
 
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = {89,22,43,32,5,13,2222,1,0};
//		maxOfArray(arr);
//		minOfArray(arr);
//		System.out.println("����ǰ�����飺");
//		printArray(arr);
////		reverseArray(arr);
////		System.out.println("���������飺");
////		printArray(arr);
//		System.out.println("����reverse2����֮������飺");
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
		System.out.println("�������Ҫ���ҵ�Ԫ�ص�����ֵ��");
		int x = sc.nextInt();
		if(x<arr.length){
			System.out.println("����"+x+"��Ӧ��Ԫ���ǣ� "+arr[x]);
		}else{
			System.out.println("���ṩ�������ǷǷ��ģ���ȷ�Ϻ���������");
		}
		sc.close();
		
	}
	public static int findElementFirst(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ҫ���ҵ�Ԫ�أ�");
		int find = sc.nextInt();
		for(int x=0;x<arr.length;x++){
			if(arr[x] == find){
				System.out.println("����ҵ�Ԫ�ص�����ֵ�ǣ� "+x);
				return 0;
			}
//			System.out.println("�������Ԫ��δ�ҵ�����ȷ�Ϻ����ԣ�");
		}
		sc.close();
		return -1;
		
	}
}
