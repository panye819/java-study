package com.study.day15_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 用集合存储5个学生对象
 *
 */
class Student {
	private String name;
	private int age;
	public Student(){
		super();
	}
	public Student(String name,int age){
		super();
		this.name = name ;
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
	
}
public class StudentDemo {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		//创建学生对象
		Student s1 = new Student("林青霞",27);
		Student s2 = new Student("风清扬",30);
		Student s3 = new Student("令狐冲",33);
		Student s4 = new Student("任盈盈",37);
		Student s5 = new Student("任我行",47);
		//把学生对象添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		//把集合转换成数组
		Object[] objs = c.toArray();
		for(int x = 0;x<objs.length;x++){
//			System.out.println(objs[x]);
			Student s = (Student)objs[x];
			System.out.println(s.getName()+"----"+s.getAge());
		}
			
	}
	
}
