package com.study.day15_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author bluebell325
 *集合的由来：
 *	如果要存储多个对象，就应该是一个容器类型的变量
 *由于对象数组不能适应变化的需求，因为数组的长度是固定的，这时候我们可以采用jihe
 *数组和集合的区别：
 *	1、长度区别：
 *		数组的长度固定，集合长度可变
 *	2、内容不同：
 *		数组中可以存储基本类型，集合只能存储对象
 *	3、元素的数据类型问题
 *		数组可以存储基本数据类型，也可以存储引用数据类型
 *		集合只能存储引用数据类型
 *集合：
 *	集合只用于存储对象，集合长度是可变的，集合可以存储不同类型的对象。
 *	针对不同的需求，Java就提供了不同的集合类，
 *数据结构：数据的存储方式。
 *这个体系的老大是Collection
 *collection接口概述：
 *	Collection层次中的根接口。Collection表示一组对象，这些对象也成为collection元素。
 *
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		
		
		//测试不带all的方法
//		Collection c = new Collection;这种写法是错误的，因为Collection是接口，不能实例化
		Collection c =  new ArrayList();
//		System.out.println("add: "+c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");
		System.out.println("c: "+c);
//		c.clear();
//		System.out.println("c: "+c);
		System.out.println("contain: "+c.contains("hello"));
		System.out.println("contain: "+c.contains("hello1"));
		System.out.println("isEmpty: "+c.isEmpty());
		System.out.println("size: "+c.size());
		
	}

}
