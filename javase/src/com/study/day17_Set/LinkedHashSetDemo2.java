package com.study.day17_Set;

import java.util.LinkedHashSet;

/**
 *
 * LinkedHashSet��
 * 	�ײ����ݽṹ��Hash����������
 * 		��ϣ��֤Ԫ�ص�Ψһ��
 * 		����֤Ԫ������
 * 	
 *
 */
public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("hello");
		ls.add("world");
		ls.add("java");
		ls.add("hello");
		
		for(String s: ls){
			System.out.println("ls : "+s);
		}
	}

}
