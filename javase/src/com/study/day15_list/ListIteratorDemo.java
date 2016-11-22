package com.study.day15_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author FlyPiG8308
 *ListIterator listInterator();List集合特有的迭代器
 *	该迭代器继承了Iterator迭代器，就可以直接使用hasNext()和next()方法
 *	特有功能：
 *		Object previous() 返回上一个元素
 *	ListIterator可以实现逆向遍历，但首先要正向遍历，所以一般不使用
 */
public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("hello");
		list.add("hello1");
		list.add("hello2");
		list.add("hello3");
		System.out.println("list contain :"+list);
		ListIterator lit = list.listIterator();
//		while(lit.hasNext()){
//			String s1 = (String)lit.next();
//			System.out.println("s1 is : "+s1);
//		}
		System.out.println("next is previous--------------");
		while(lit.hasPrevious()){
			String s2 = (String)lit.previous();
			System.out.println("previos is : "+s2);
		}
//		System.out.println("previos is : "+lit.previous());
//		System.out.println("previos is : "+lit.previous());
//		System.out.println("previos is : "+lit.previous());
//		System.out.println("previos is : "+lit.previous());
		System.out.println("above is previous--------------");
//		ListIterator 
		Iterator it  = list.iterator();
		while(it.hasNext()){
		String s = (String)it.next();
		System.out.println("s is : "+s);
		}
		
	
		
	}

}
