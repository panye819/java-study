package com.study.day18_Map;

import java.util.TreeMap;

/**
 *TreeMap�ǻ��ں������Map�ӿڵ�ʵ��
 *
 *
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("1", "�Ƹ�");
		tm.put("2", "���");
		tm.put("3", "����");
		tm.put("1", "����");
		tm.put("4", "�ŷ�");
		tm.put("4", "����");
		System.out.println("tm contain : "+tm);
	}

}
