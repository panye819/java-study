package com.study.day13_StringBuffer;

/**
 * ð������
 * 		����Ԫ�������Ƚϣ��������š���һ����Ϻ����ֵ�ͳ����������������
 * 		ͬ�������������Եõ�һ���ź�������顣
 *
 */
public class BubbleSortDemo {
	public static void main(String[] args) {
		int[] arr = {24,69,80,57,13};
		System.out.println("����ǰ��");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("�����");
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
//		for(int x=0;x<arr.length-1-0;x++){ //-1��Ϊ�˱�������Խ�磬-0��Ϊ�˼��ٱȽϴ���
//		if(arr[x]>arr[x+1]){
//			int temp = arr[x];
//			arr[x] = arr[x+1];
//			arr[x+1] = temp;
//		}
//	}
//	System.out.println("��һ�������");
//	printArray(arr);
//	for(int x=0;x<arr.length-1-1;x++){
//		if(arr[x]>arr[x+1]){
//			int temp = arr[x];
//			arr[x] = arr[x+1];
//			arr[x+1] = temp;
//		}
//	}
//	System.out.println("�ڶ��������");
//	printArray(arr);
//	for(int x=0;x<arr.length-1-2;x++){
//		if(arr[x]>arr[x+1]){
//			int temp = arr[x];
//			arr[x] = arr[x+1];
//			arr[x+1] = temp;
//		}
//	}
//	System.out.println("�����������");
//	printArray(arr);
//	for(int x=0;x<arr.length-1-3;x++){
//		if(arr[x]>arr[x+1]){
//			int temp = arr[x];
//			arr[x] = arr[x+1];
//			arr[x+1] = temp;
//		}
//	}
//	System.out.println("���Ĵ������");
//	printArray(arr);
	}
}
