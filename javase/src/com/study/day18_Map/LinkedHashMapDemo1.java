package com.study.day18_Map;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap:是Map接口的哈希表和链接列表的实现，具有可预知的迭代顺序
 *由Hash表保证键的唯一性，由链表保证键的有序
 */
public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		hm.put("1", "黄盖");
		hm.put("2", "周瑜");
		hm.put("3", "关羽");
		hm.put("1", "张辽");
		hm.put("4", "张飞");
		hm.put("4", "赵云");
		System.out.println("hm contain : "+hm);
		
	} 

}
