package com.study.day13_StringBuffer;

public class ArrayTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dacgebf";
		char[] chs = s.toCharArray();
		System.out.println("≈≈–Ú«∞");
		printArray(chs);
		System.out.println("≈≈–Ú∫Û");
//		bubbleSort(chs);
		selectionSort(chs);
		printArray(chs);
		
	}

	private static void selectionSort(char[] chs) {
		for(int x=0;x<chs.length;x++){
			for(int y=x+1;y<chs.length;y++){
				if(chs[y]<chs[x]){
					char temp = chs[x];
					chs[x] = chs[y];
					chs[y] = temp;
				}
			}
		}
		
	}

	private static void bubbleSort(char[] chs) {
		for(int x=0;x<chs.length-1;x++){
			for(int y=0;y<chs.length-1-x;y++){
				if(chs[y]>chs[y+1]){
					char temp = chs[y];
					chs[y] = chs[y+1];
					chs[y+1] = temp;
				}
			}
		}
		
	}
	
	private static void printArray(char[] chs) {
		System.out.print("[");
		for(int x=0;x<chs.length;x++){
			if(x == chs.length-1){
				System.out.println(chs[x]+"]");
			}else{
				System.out.print(chs[x]+",");
			}
			
		}
		
	}

}
