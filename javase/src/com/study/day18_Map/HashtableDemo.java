package com.study.day18_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/**
 * Hashtable��HashMap������
 * 	Hashtable���̰߳�ȫ��Ч�ʵͣ�������Null����nullֵ
 * 	HashMap:�̲߳���ȫ��Ч�ʸߣ�����Null����nullֵ
 *
 */
public class HashtableDemo {
	public static void main(String[] args) {
		HashMap<String, String> hm = new LinkedHashMap<String, String>();
		Hashtable<String,String> ht = new Hashtable<String, String>();
		ht.put("1", "java");
//		ht.put("2", null);//java.lang.NullPointerException
//		ht.put(null, "world");//java.lang.NullPointerException
		System.out.println("ht contain :"+ht);
		
		hm.put("1", "java");
		hm.put("2", null);
		hm.put(null, "world");
		System.out.println("ht contain :"+hm);
	}

}
