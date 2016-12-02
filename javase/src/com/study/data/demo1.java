package com.study.data;

public class demo1 {
	
	//存储场上球员的球衣号码
	private static Integer[] players = null;
	//场上球员的个数
	private static int size = 0;
	//1、初始容量为5的线性列表
	public static void init(int initialCapacity){
		players = new Integer[initialCapacity];	
	}
	
	public static void add(Integer playerNum){
		players[size] = playerNum;
		
	}
	//打印出球衣号码
	public static void print(){
		if(size == 0 ){
			System.out.println("null");
		}
		if( players == null){
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		//初始容量为5的线性列表
		init(5);
		//安排5个球员上场
		add(11);
		add(22);
		add(33);
		add(44);
		add(55);
		
		
	}

}
