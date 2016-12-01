package com.study.day13_StringBuffer;

/**
 * 	选择排序：
 * 		从0索引开始，一次和后面的元素比较，小的往前放，第一次完毕后，最小值出现在最小索引处。
 * 		其他同理，就可以得到一个排好序的数组。
 *
 */
public class SelectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {24,69,80,57,13};
		System.out.println("排序前：");
		printArray(arr);
		selectionSort(arr);
		System.out.println("排序后：");
		selectionSort(arr);
		printArray(arr);
//		System.out.println("第一次排序后");
//		int x = 0;
//		for(int y=1;y<arr.length;y++){
//			if(arr[y]<arr[x]){
//				int temp = arr[x];
//				arr[x] = arr[y];
//				arr[y] = temp;
//				
//			}
//			
//		}
//		printArray(arr);
//		System.out.println("第二次排序后");
//		x = 1;
//		for(int y=2;y<arr.length;y++){
//			if(arr[y]<arr[x]){
//				int temp = arr[x];
//				arr[x] = arr[y];
//				arr[y] = temp;
//				
//			}
//			
//		}
//		printArray(arr);
//		System.out.println("第三次排序后");
//		x = 2;
//		for(int y=3;y<arr.length;y++){
//			if(arr[y]<arr[x]){
//				int temp = arr[x];
//				arr[x] = arr[y];
//				arr[y] = temp;
//				
//			}
//			
//		}
//		printArray(arr);
//		System.out.println("第四次排序后");
//		x = 3;
//		for(int y=4;y<arr.length;y++){
//			if(arr[y]<arr[x]){
//				int temp = arr[x];
//				arr[x] = arr[y];
//				arr[y] = temp;
//				
//			}
//			
//		}
//		printArray(arr);
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
	public static void selectionSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[y]<arr[x]){
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
}
