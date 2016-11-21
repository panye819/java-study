package com.study.day15_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author bluebell325
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		
		
		//测试不带all的方法
//		Collection c = new Collection;这种写法是错误的，因为Collection是接口，不能实例化
		Collection c1 =  new ArrayList();
//		System.out.println("add: "+c.add("hello"));
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		System.out.println("c1: "+c1);
		Collection c2 =  new ArrayList();
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		System.out.println("c2: "+c2);
		
		System.out.println("c1.addAll: "+c1.addAll(c2));
		System.out.println("c1: "+c1);

	}

}
