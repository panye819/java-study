package com.study.day16_list;

import java.util.Arrays;
import java.util.List;


/**
 * public static <T> List<T> asList(T... a):������ת���ɼ���
 * 
 * ע�����
 * 	ת���γɵļ��ϲ�����ɾ��ֻ���޸ģ���Ϊ��ʵ�ʻ���һ�����飬�䳤���ǹ̶���
 * 
 *
 */
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		String[] strArray = {"java","world","hello","javaee"};
		List<String> list = Arrays.asList(strArray);
//		list.add("javaee");
//		list.remove(1);
		list.set(0, "javase");
		for(String s : list){
			System.out.println(s);
		}
	}

}
