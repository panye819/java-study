package com.study.day13_StringBuffer;

/**
 * 	ѡ������
 * 		��0������ʼ��һ�κͺ����Ԫ�رȽϣ�С����ǰ�ţ���һ����Ϻ���Сֵ��������С��������
 * 		����ͬ���Ϳ��Եõ�һ���ź�������顣
 *
 */
public class SelectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {24,69,80,57,13};
		System.out.println("����ǰ��");
		printArray(arr);
		selectionSort(arr);
		System.out.println("�����");
		selectionSort(arr);
		printArray(arr);
//		System.out.println("��һ�������");
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
//		System.out.println("�ڶ��������");
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
//		System.out.println("�����������");
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
//		System.out.println("���Ĵ������");
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
