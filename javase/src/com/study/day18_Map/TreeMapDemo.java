package com.study.day18_Map;

import java.util.TreeMap;

/**
 *TreeMap是基于红黑树的Map接口的实现
 *
 *
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("1", "黄盖");
		tm.put("2", "周瑜");
		tm.put("3", "关羽");
		tm.put("1", "张辽");
		tm.put("4", "张飞");
		tm.put("4", "赵云");
		System.out.println("tm contain : "+tm);
	}

}
