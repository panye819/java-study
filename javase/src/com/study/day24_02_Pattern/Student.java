package com.study.day24_02_Pattern;

/**
 *	饿汉式：
 *		类一加载就创建对象.
 *		是不会出问题的设计模式
 *	懒汉式：
 *		需要对象的时候才去创建对象。
 *		可能会出问题的。
 *			1、延迟加载思想
 *			2、线程安全问题。
 */
public class Student {
	private Student(){}
	//静态成员变量
	//为了不让外界修改这个变量，需要对其权限进行控制，加private
	private static Student s = new Student();
	//为了保证外界可以直接访问该方法，需要加static修饰
	public static Student getStudent(){
		return s;
		
	}
}
