package com.study.day13_StringBuffer;

/**
 * 冒泡排序：
 * 		相邻元素两两比较，大的往后放。第一次完毕后，最大值就出现了最大索引处。
 * 		同理，继续，即可以得到一个排好序的数组。
 *
 */
public class BubbleSortDemo {
	public static void main(String[] args) {
		int[] arr = {24,69,80,57,13};
		System.out.println("排序前：");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("排序后：");
		printArray(arr);
	}
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int x=0;x<arr.length;x++ ){
			if(x == arr.length-1){
				System.out.println(arr[x]+"]");
			}else{
				System.out.print(arr[x]+",");
			}
		}
	}
	public static void bubbleSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-1-x;y++){
				if(arr[y]>arr[y+1]){
				int temp = arr[y];
				arr[y] = arr[y+1];
				arr[y+1] = temp;
				}
			}
		}
	}
	public static void bubbleSort2(int[] arr){
//		for(int x=0;x<arr.length-1-0;x++){ //-1是为了避免索引越界，-0是为了减少比较次数
//		if(arr[x]>arr[x+1]){
//			int temp = arr[x];
//			arr[x] = arr[x+1];
//			arr[x+1] = temp;
//		}
//	}
//	System.out.println("第一次排序后：");
//	printArray(arr);
//	for(int x=0;x<arr.length-1-1;x++){
//		if(arr[x]>arr[x+1]){
//			int temp = arr[x];
//			arr[x] = arr[x+1];
//			arr[x+1] = temp;
//		}
//	}
//	System.out.println("第二次排序后：");
//	printArray(arr);
//	for(int x=0;x<arr.length-1-2;x++){
//		if(arr[x]>arr[x+1]){
//			int temp = arr[x];
//			arr[x] = arr[x+1];
//			arr[x+1] = temp;
//		}
//	}
//	System.out.println("第三次排序后：");
//	printArray(arr);
//	for(int x=0;x<arr.length-1-3;x++){
//		if(arr[x]>arr[x+1]){
//			int temp = arr[x];
//			arr[x] = arr[x+1];
//			arr[x+1] = temp;
//		}
//	}
//	System.out.println("第四次排序后：");
//	printArray(arr);
	}
}
