package com.study.day16_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 增强for
 *	格式：for(元素数据类型 变量: 数组或者集合
 *	使用该变量即可，该变量就是元素
 *	好处：
 *		简化了数组和集合的遍历
 *	弊端：
 *		增强for的目标不能为null
 *		如何解决：
 *			对增强for的目标先进行不为null的判断，然后再遍历。
 */
public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		for(int x = 0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
		System.out.println("----------------");
		//增强for
		//格式：for(元素数据类型 变量: 数组或者集合
				//使用该变量即可，该变量就是元素
		for(int x:arr){
			System.out.println(x);
		}
		System.out.println("----------------");
		//
		String[] strArr = {"曼联","阿森纳","利物浦","北京","南京"};
		for(String s : strArr){
			System.out.println(s);
		}
		System.out.println("----------------");
		//
		Collection <String>col = new ArrayList<String>();
		col.add("浦口区");
		col.add("鼓楼区");
		col.add("秦淮区");

		for(String c : col){
			System.out.println(c);
		}
		System.out.println("----------------");
		//
		List <String>list = null;
		//java.lang.NullPointerException
		
		if(list != null){
			for(String s : list){
				System.out.println(s);	
		}
		}else{
			System.out.println("object is null!!");
		
		}
		
		
		
	}

}
