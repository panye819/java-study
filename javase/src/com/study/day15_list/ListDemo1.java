package com.study.day15_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author FlyPiG8308
 *List���ϵ��ص㣺
 *	����(�洢��ȡ����Ԫ��һ��)�Ϳ����ظ���
 *List�������еĹ��ܣ�
 *	1����ӹ��ܣ�
 *	2����ȡ����
 *	3���б������
 *		ListIterator listInterator();List�������еĵ�����
 *	4��ɾ������
 *	5���޸Ĺ���
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
		//��ָ��λ�����Ԫ��
		list.add(1, "1");
		list.add(9, "element");
//		list.add(11, "element");����Խ��
		
		//��ȡָ��λ�õ�Ԫ��
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
