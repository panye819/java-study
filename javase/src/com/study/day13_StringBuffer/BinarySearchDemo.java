package com.study.day13_StringBuffer;

/**
 * 基本查找：数组元素无序（从头找到尾）	
 * 二分查找（折半查找）：数组元素有序
 * 	注意事项：
 * 			
 *
 */
public class BinarySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,22,33,44,55,66,77};
		
		System.out.println("原数组");
		printArray(arr);
		System.out.println("查找结果");
		int result = binarySearch(arr,44);
		System.out.println("result is : "+result);
		System.out.println("------------------");
		result = binarySearch(arr,444);
		System.out.println("result is : "+result);
	}

	private static int binarySearch(int[] arr,int value) {
		int maxIndex = arr.length-1;
		int minIndex = 0;
		int midIndex = (maxIndex+minIndex)/2;
		while(value != arr[midIndex]){
			if(arr[midIndex] > value){
				maxIndex = midIndex -1;
			}else{
				minIndex = midIndex+1;
			}
			if(minIndex > maxIndex){
				return -1;
			}
			midIndex = (maxIndex+minIndex)/2;	
		}
	
		return midIndex;
	}
	
	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x == arr.length-1){
				System.out.println(arr[x]+"]");
			}else{
				System.out.print(arr[x]+",");
			}
			
		}
		
	}

}
