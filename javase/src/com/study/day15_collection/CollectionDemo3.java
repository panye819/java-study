package com.study.day15_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 *���ϵı�����
 *	��ʵ�������λ�ȡ�����е�Ԫ��
 *
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
			//���Բ���all�ķ���
//		Collection c = new Collection;//����д���Ǵ���ģ���ΪCollection�ǽӿڣ�����ʵ����
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
