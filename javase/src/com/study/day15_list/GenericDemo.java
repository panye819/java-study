package com.study.day15_list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *����
 *	1�����壺
 *		����ģ������ķ����������ڴ��������ʱ����ȷָ��Ԫ�ص��������ͣ������Ͳ�����ڰ�ȫ�����ˣ����ּ�������Ϊ���͡�
 *	2����ʽ��
 *		<��������>
 *		�˴�����������ֻ������������
 *	3���ô���
 *		������ʱ��������ǰ���˱����ڼ�
 *		������ǿ������ת��
 *		�Ż��˳�����ƣ�����˻�ɫ����
 *���ڵ�Object���Ϳ��Խ�������Ķ������ͣ�������ʵ��ʹ�ù����У���������ת�������⣬Ҳ�ʹ���������������Java�ṩ�˷���������������
 *
 */
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>arr = new ArrayList<String>();
		arr.add("hello");
		arr.add("world");
		arr.add("java");
//		arr.add(10);
		
		Iterator <String>it = arr.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
			}
		
		
	}

}
