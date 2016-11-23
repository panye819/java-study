package com.study.day17_Set;

import java.util.LinkedHashSet;

/**
 *
 * LinkedHashSet：
 * 	底层数据结构由Hash表和链表组成
 * 		哈希表保证元素的唯一性
 * 		链表保证元素有序
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
