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
//		Collection c = new Collection;//这种写法是错误的，因为Collection是接口，不能实例化
		Collection c1 =  new ArrayList();
//		System.out.println("add: "+c.add("hello"));
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		System.out.println("c1: "+c1);
		Collection c2 =  new ArrayList();
//		c2.add("abc1");
//		c2.add("abc2");
//		c2.add("abc3");
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		System.out.println("c2: "+c2);
		
		System.out.println("c1.addAll: "+c1.addAll(c2));
		System.out.println("c1: "+c1);
		/*boolean removeAll(Collection c),只要有一个元素被移除了就返回true
		boolean containAll(Collection c),只有包含所有元素才叫包含
		boolean retainAll(Collection c),只有包含所有元素才叫包含
		假设有二个集合A和B，A对B做交集，最终的结果保存在A中，B不变，返回值反映A是否有改变。
		*/
		System.out.println("retianAll: "+c1.retainAll(c2));
		
		

	}

}
