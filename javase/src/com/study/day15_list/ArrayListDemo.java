package com.study.day15_list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ȡ��List���ظ���Ԫ��
 * ˼·��
 * 	1���������϶���
 * 	2����Ӷ��Ԫ�أ������ظ�Ԫ�أ�
 * 	3�������¼���
 * 	4�������ɼ��ϲ�ȡ��ÿһ��Ԫ��
 * 	5�������Ԫ�ص��¼�����ȥ�ң����û�оͷ����¼��ϣ�����оͺ���
 * 	6�������¼���
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
		//�����¼���
		ArrayList arr1 = new ArrayList();
		
		//�����ɼ��ϻ�ȡÿһ��Ԫ��
		Iterator it = arr.iterator();
		
		while(it.hasNext()){
			String s = (String)it.next();
//			System.out.println(s);
			//�����Ԫ��ȥ�Ա��¼��ϣ����û�оͷ����¼���
			if(!arr1.contains(s)){
				arr1.add(s);
			}
		}
		System.out.println("----------");
		//�����¼���
		for(int x = 0;x<arr1.size();x++){
			String s1 = (String)arr1.get(x);
			System.out.println("arr1 contain : "+s1);
		}
	

	}

}
