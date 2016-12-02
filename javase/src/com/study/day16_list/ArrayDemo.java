package com.study.day16_list;

import java.util.Arrays;
import java.util.List;


/**
 * public static <T> List<T> asList(T... a):把数组转换成集合
 * 
 * 注意事项：
 * 	转换形成的集合不能增删，只能修改，因为其实质还是一个数组，其长度是固定的
 * 
 *
 */
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个数组
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
