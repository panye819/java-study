package com.study.day15_list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *��LinkedListģ��ջ
 *
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link = new LinkedList();
		link.addFirst("hello");
		link.addFirst("world");
		link.addFirst("java");
		
		Iterator it = link.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println("s : "+s);
		}
	}

}
