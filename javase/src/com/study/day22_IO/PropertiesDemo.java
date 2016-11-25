package com.study.day22_IO;

import java.util.Properties;
import java.util.Set;

/**
 * Properties 
 * 	属性集合类，是一个可以和IO流结合使用的集合类
 * 	类表示了一个持久的属性集。
 * 	Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。 
 *
 */
public class PropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		prop.put("it001", "诸葛亮");
		prop.put("it002", "郭嘉");
		prop.put("it003", "荀彧");
		
		System.out.println("prop contain: "+prop);
		
		Set<Object> set = prop.keySet();
		for(Object key :set){
			Object value = prop.get(key);
			System.out.println(key+" : "+value);
			
		}
	}

}
