package com.study.day05_array;

/**
 * 
  */	
public class ArrayDemo3 {
	public static void main(String[] args) {
		int[][] arr = new int[][]{{1,2,3,4,5},{4,5,6,7},{6,7,8,9,10}};
		int[][] arr2 = new int[][]{{22,66,44},{77,33,88},{25,44,65},{11,66,99}};
		printArray(arr);
		sumArray(arr);
		System.out.println("--------------");
		printArray(arr2);
		sumArray(arr2);
	}
	public static void printArray(int[][] arr){
		for(int x =0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				System.out.println("arr"+x+"_"+y+" is: "+arr[x][y]);
			}
			System.out.println("");
		}
	}
	public static void sumArray(int[][] arr){
		int sum = 0;
		for(int x =0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				sum += arr[x][y];
			}
		}
		System.out.println("the sum is : "+sum);
	}
}
