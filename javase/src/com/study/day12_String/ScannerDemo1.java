package com.study.day12_String;

import java.util.Scanner;

public class ScannerDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int x = sc.nextInt();
		System.out.println("你输入的数字是："+x);
	}

}
