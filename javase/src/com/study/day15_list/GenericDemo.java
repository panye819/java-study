package com.study.day15_list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *泛型
 *	1、定义：
 *		集合模仿数组的方法，可以在创建对象的时候明确指定元素的数据类型，这样就不会存在安全问题了，这种技术被称为泛型。
 *	2、格式：
 *		<数据类型>
 *		此处的数据类型只能是引用类型
 *	3、好处：
 *		把运行时的问题提前到了编译期间
 *		避免了强制类型转换
 *		优化了程序设计，解决了黄色警报
 *早期的Object类型可以接受任意的对象类型，但是在实际使用过程中，会有类型转换的问题，也就存在着隐患，所以Java提供了泛型来解决这个问题
 *
 */
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>arr = new ArrayList<String>();
		arr.add("hello");
		arr.add("world");
		arr.add("java");
//		arr.add(10);
		
		Iterator <String>it = arr.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
			}
		
		
	}

}
