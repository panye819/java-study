package com.study.day15_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * @author FlyPiG8308
 * ����
 * 		��һ�������У��ж����������"world"Ԫ�أ�����У������һ��"javaee"Ԫ�ء�
 * �����޸��쳣
 * 	��������⵽Ԫ�صĲ����޸�ʱ�����׳�һ�������޸��쳣ConcurrentModificationException
 * 	����ԭ��
 * 		�������������ڼ��ϴ��ڵģ����жϳɹ��󣬼�����������µ�Ԫ�أ���������ȴ��֪�������Ծ��׳��쳣.
 * 
 * 	���������
 * 		1������������Ԫ�أ��������޸�Ԫ��
 * 			Ԫ�ػ�����ڸղŵ�����Ԫ�غ���
 * 		2�����ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
 * 			Ԫ�ػ���ӵ����ϵ������
 *	
 */
public class ListIteratorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("Java");
		System.out.println("list contain :"+list);
		ListIterator lit = list.listIterator();
		//��ʽһ��
//		while(lit.hasNext()){
//			String s = (String) lit.next();
//			if("world".equals(s)){
//				lit.add("javaee");
//			}
//		}
//		System.out.println("list contain :"+list);
		//��ʽ����
			for(int x=0;x<list.size();x++){
				String s = (String) list.get(x);
				if("world".equals(s)){
					list.add("javaee");
				}
			}
			System.out.println("list contain :"+list);		
	}
}
