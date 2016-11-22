package com.study.day15_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *集合的遍历：
 *	其实就是依次获取集合中的元素
 *迭代器为什么不定义成一个类，而是定义成一个接口呢
 *	如果迭代器定义成一个类，那么我们可以创建对象，调用方法，但由于Java提供了很多集合类，它们的数据结构是不同的，所以存储的方式和遍历的方式是不同的，最终没有定义迭代器类
 *	无论你是哪种集合，都应该具有元素的操作和判断获取功能，而每一种集合的方式又不太一样，所以我们把这2个功能提取吹来，并不提供具体实现，这即是接口。
 *	真正的实现类在具体的子类中。
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
			//测试不带all的方法
//		Collection c = new Collection;//这种写法是错误的，因为Collection是接口，不能实例化
		Collection c1 =  new ArrayList();
//		System.out.println("add: "+c.add("hello"));
		c1.add("abc1111");
		c1.add("abc222");
		c1.add("abc33");
		c1.add("abc4");
		c1.add("a1");
		System.out.println("c1: "+c1);
		Object[] objs = c1.toArray();
//		for(int x = 0;x < objs.length;x++){
////			System.out.println(objs[x]);
//			String s = (String) objs[x];
//			System.out.println(s+"----"+s.length());
////			System.out.println();
//		}
//		Iterator it = c1.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//元素越界
		//需要加一个判断，如果已经是最后一个元素了，就不再迭代
//		while(it.hasNext()){
////			System.out.println(it.next());
//			String s = (String)it.next();
//			System.out.println(s);
//		}
//		for(int x=0;x<objs.length;x++){
//			String s1 = (String)(it.next());
//			System.out.println(s1);
//		}
		//for循环改写
		System.out.println("------------------");
		for(Iterator it = c1.iterator();it.hasNext();){
			String s1 = (String)(it.next());
			System.out.println(s1);
		}
		

	}

}
