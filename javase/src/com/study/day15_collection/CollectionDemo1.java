package com.study.day15_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author bluebell325
 *���ϵ�������
 *	���Ҫ�洢������󣬾�Ӧ����һ���������͵ı���
 *���ڶ������鲻����Ӧ�仯��������Ϊ����ĳ����ǹ̶��ģ���ʱ�����ǿ��Բ���jihe
 *����ͼ��ϵ�����
 *	1����������
 *		����ĳ��ȹ̶������ϳ��ȿɱ�
 *	2�����ݲ�ͬ��
 *		�����п��Դ洢�������ͣ�����ֻ�ܴ洢����
 *	3��Ԫ�ص�������������
 *		������Դ洢�����������ͣ�Ҳ���Դ洢������������
 *		����ֻ�ܴ洢������������
 *���ϣ�
 *	����ֻ���ڴ洢���󣬼��ϳ����ǿɱ�ģ����Ͽ��Դ洢��ͬ���͵Ķ���
 *	��Բ�ͬ������Java���ṩ�˲�ͬ�ļ����࣬
 *���ݽṹ�����ݵĴ洢��ʽ��
 *�����ϵ���ϴ���Collection
 *collection�ӿڸ�����
 *	Collection����еĸ��ӿڡ�Collection��ʾһ�������Щ����Ҳ��ΪcollectionԪ�ء�
 *
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		
		
		//���Բ���all�ķ���
//		Collection c = new Collection;����д���Ǵ���ģ���ΪCollection�ǽӿڣ�����ʵ����
		Collection c =  new ArrayList();
//		System.out.println("add: "+c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");
		System.out.println("c: "+c);
//		c.clear();
//		System.out.println("c: "+c);
		System.out.println("contain: "+c.contains("hello"));
		System.out.println("contain: "+c.contains("hello1"));
		System.out.println("isEmpty: "+c.isEmpty());
		System.out.println("size: "+c.size());
		
	}

}
