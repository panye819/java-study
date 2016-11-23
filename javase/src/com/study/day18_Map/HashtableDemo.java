package com.study.day18_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/**
 * Hashtable与HashMap的区别：
 * 	Hashtable：线程安全，效率低，不允许Null键和null值
 * 	HashMap:线程不安全，效率高，允许Null键和null值
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
