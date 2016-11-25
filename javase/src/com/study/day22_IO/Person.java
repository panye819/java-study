package com.study.day22_IO;

import java.io.Serializable;

/**
 *	对于不想序列化的成员变量可以使用transient关键字
 */
public class Person implements Serializable{
	private static final long serialVersionUID = -5897476469565443768L;
	private String name;
	private transient int age;
//	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

