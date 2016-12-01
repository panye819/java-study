package com.study.day13_StringBuffer;

import java.util.Arrays;

/**
 * Arrays¿‡£∫
 * 		
 *
 */
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {24,69,80,57,13};
		System.out.println("≈≈–Ú«∞£∫"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("≈≈–Ú∫Û£∫"+Arrays.toString(arr));
		System.out.println("--------------------------------");
		
		System.out.println(Arrays.binarySearch(arr, 80));
	}

}
