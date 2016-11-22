package com.study.day15_list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 取出List中重复的元素
 * 思路：
 * 	1、创建集合对象
 * 	2、添加多个元素（包含重复元素）
 * 	3、创建新集合
 * 	4、遍历旧集合并取到每一个元素
 * 	5、拿这个元素到新集合中去找，如果没有就放入新集合，如果有就忽略
 * 	6、遍历新集合
 *
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		ArrayList arr = new ArrayList();
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		arr.add("hello");
		System.out.println("arr is : "+arr);
		//创建新集合
		ArrayList arr1 = new ArrayList();
		
		//遍历旧集合获取每一个元素
		Iterator it = arr.iterator();
		
		while(it.hasNext()){
			String s = (String)it.next();
//			System.out.println(s);
			//拿这个元素去对比新集合，如果没有就放入新集合
			if(!arr1.contains(s)){
				arr1.add(s);
			}
		}
		System.out.println("----------");
		//遍历新集合
		for(int x = 0;x<arr1.size();x++){
			String s1 = (String)arr1.get(x);
			System.out.println("arr1 contain : "+s1);
		}
	

	}

}
