package com.study.day15_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 *集合的遍历：
 *	其实就是依次获取集合中的元素
 *
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
			//测试不带all的方法
//		Collection c = new Collection;//这种写法是错误的，因为Collection是接口，不能实例化
		Collection c1 =  new ArrayList();
//		System.out.println("add: "+c.add("hello"));
		c1.add("abc1111");
		c1.add("abc222");
		c1.add("abc33");
		c1.add("abc4");
		System.out.println("c1: "+c1);
		Object[] objs = c1.toArray();
		for(int x = 0;x < objs.length;x++){
//			System.out.println(objs[x]);
			String s = (String) objs[x];
			System.out.println(s+"----"+s.length());
//			System.out.println();
		}
		
		
		

	}

}
