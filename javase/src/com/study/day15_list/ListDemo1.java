package com.study.day15_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author FlyPiG8308
 *List集合的特点：
 *	有序(存储和取出的元素一致)和可以重复的
 *List集合特有的功能：
 *	1、添加功能：
 *	2、获取功能
 *	3、列表迭代器
 *		ListIterator listInterator();List集合特有的迭代器
 *	4、删除功能
 *	5、修改功能
 */
public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("javaee");
		list.add("android");
		list.add("-------");
		list.add("javaee");
		list.add("android");
		System.out.println("list: "+list);
		//在指定位置添加元素
		list.add(1, "1");
		list.add(9, "element");
//		list.add(11, "element");索引越界
		
		//获取指定位置的元素
		System.out.println("get: "+list.get(1));
		System.out.println("get: "+list.get(9));

		for(int x = 0;x<list.size();x++){
			String s = (String)list.get(x);
			System.out.println("element in "+x+" is: "+s);
		}
//		Iterator it = list.iterator();
//		while(it.hasNext()){
//			String s = (String)it.next();
//			System.out.println(s);
//		}
	}

}
