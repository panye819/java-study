package com.study.data;

public class demo1 {
	
	//�洢������Ա�����º���
	private static Integer[] players = null;
	//������Ա�ĸ���
	private static int size = 0;
	//1����ʼ����Ϊ5�������б�
	public static void init(int initialCapacity){
		players = new Integer[initialCapacity];	
	}
	
	public static void add(Integer playerNum){
		players[size] = playerNum;
		
	}
	//��ӡ�����º���
	public static void print(){
		if(size == 0 ){
			System.out.println("null");
		}
		if( players == null){
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		//��ʼ����Ϊ5�������б�
		init(5);
		//����5����Ա�ϳ�
		add(11);
		add(22);
		add(33);
		add(44);
		add(55);
		
		
	}

}
