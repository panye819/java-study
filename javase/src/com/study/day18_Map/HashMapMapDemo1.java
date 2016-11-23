package com.study.day18_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map接口概述：
 * 	将键映射到值得对象
 * 	一个映射不能包含重复的键
 * 	每个键最多映射到一个值上
 *Map是双列的，Collection是单列的
 *Map的键唯一，Collection的子体系Set是唯一的
 *Map集合的数据结构值针对键有效，对值无关，Collection集合的数据结构是针对元素有效
 *
 */
public class HashMapMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		
		//添加元素
		//如果键是第一次存储，则直接添加，如果不是第一次存储，则将新的值覆盖旧的值，并返回旧的值
		map.put("黄盖", "东吴");
		map.put("周瑜", "东吴");
		map.put("关羽", "蜀汉");
		map.put("张辽", "曹魏");
		map.put("张飞", "曹魏");
		
		System.out.println("map:"+map);
		
		//清空集合
//		map.clear();
//		System.out.println("map: "+map);
		System.out.println("-------------");
		//查找元素
		System.out.println(map.get("黄盖"));
		System.out.println(map.get("黄巢"));
		System.out.println("-------------");
		//修改元素
		map.put("张飞", "蜀汉");
		System.out.println(map.get("张飞"));
		System.out.println("-------------");
		//判断集合是否没为空
		System.out.println("map is empty: "+map.isEmpty());
		System.out.println("-------------");
		//判断集合是否包含指定的key
		System.out.println("map contain 张飞： "+map.containsKey("张飞"));
		System.out.println("-------------");
		//判断集合是否包含指定的value
		System.out.println("map contain 蜀汉： "+map.containsValue("蜀汉"));
		System.out.println("map contain 大汉： "+map.containsValue("大汉"));
		System.out.println("-------------");
		//返回集合中所有键的集合
		Set<String> set = map.keySet();
		for(String s:set){
			System.out.println("map key is : "+s);
		}
		System.out.println("-------------");
		//返回集合中所有值的集合
		Collection<String> valueSet = map.values();
		for(String s:valueSet){
			System.out.println("map value is : "+s);
		}
		System.out.println("-------------");
		//map遍历
		Set<String> mapSet = map.keySet();
		for(String s:mapSet){
//			System.out.println("map key is : "+s+"--its value is:"+map.get(s));
			System.out.println(s+":"+map.get(s));
			//获取所有键值对对象
			System.out.println("-------------");
			Set<Map.Entry<String,String>> setMap = map.entrySet();
			for(Map.Entry<String,String> s1:setMap){
				String key = s1.getKey();
				String value = s1.getValue();
				System.out.println("key is : "+key+"--value is: "+value);
			}
		}
		
	} 

}
