package com.study.day15_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * @author FlyPiG8308
 * 需求：
 * 		在一个集合中，判断里面如果有"world"元素，如果有，就添加一个"javaee"元素。
 * 并发修改异常
 * 	当方法检测到元素的并发修改时，会抛出一个并发修改异常ConcurrentModificationException
 * 	产生原因：
 * 		迭代器是依赖于集合存在的，当判断成功后，集合中添加了新的元素，而迭代器却不知道，所以就抛出异常.
 * 
 * 	解决方法：
 * 		1、迭代器迭代元素，迭代器修改元素
 * 			元素会添加在刚才迭代的元素后面
 * 		2、集合遍历元素，集合修改元素(普通for)
 * 			元素会添加到集合的最后面
 *	
 */
public class ListIteratorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("Java");
		System.out.println("list contain :"+list);
		ListIterator lit = list.listIterator();
		//方式一：
//		while(lit.hasNext()){
//			String s = (String) lit.next();
//			if("world".equals(s)){
//				lit.add("javaee");
//			}
//		}
//		System.out.println("list contain :"+list);
		//方式二：
			for(int x=0;x<list.size();x++){
				String s = (String) list.get(x);
				if("world".equals(s)){
					list.add("javaee");
				}
			}
			System.out.println("list contain :"+list);		
	}
}
