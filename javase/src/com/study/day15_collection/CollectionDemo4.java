package com.study.day15_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *���ϵı�����
 *	��ʵ�������λ�ȡ�����е�Ԫ��
 *������Ϊʲô�������һ���࣬���Ƕ����һ���ӿ���
 *	��������������һ���࣬��ô���ǿ��Դ������󣬵��÷�����������Java�ṩ�˺ܶ༯���࣬���ǵ����ݽṹ�ǲ�ͬ�ģ����Դ洢�ķ�ʽ�ͱ����ķ�ʽ�ǲ�ͬ�ģ�����û�ж����������
 *	�����������ּ��ϣ���Ӧ�þ���Ԫ�صĲ������жϻ�ȡ���ܣ���ÿһ�ּ��ϵķ�ʽ�ֲ�̫һ�����������ǰ���2��������ȡ�����������ṩ����ʵ�֣��⼴�ǽӿڡ�
 *	������ʵ�����ھ���������С�
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
			//���Բ���all�ķ���
//		Collection c = new Collection;//����д���Ǵ���ģ���ΪCollection�ǽӿڣ�����ʵ����
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
//		System.out.println(it.next());//Ԫ��Խ��
		//��Ҫ��һ���жϣ�����Ѿ������һ��Ԫ���ˣ��Ͳ��ٵ���
//		while(it.hasNext()){
////			System.out.println(it.next());
//			String s = (String)it.next();
//			System.out.println(s);
//		}
//		for(int x=0;x<objs.length;x++){
//			String s1 = (String)(it.next());
//			System.out.println(s1);
//		}
		//forѭ����д
		System.out.println("------------------");
		for(Iterator it = c1.iterator();it.hasNext();){
			String s1 = (String)(it.next());
			System.out.println(s1);
		}
		

	}

}
