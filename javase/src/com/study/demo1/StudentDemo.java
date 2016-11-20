package com.study.demo1;
/*
 * this:是当前类的对象引用。简单的记，它就代表当前类的对象
 * 
 * 		注意：方法被哪个对象调用，在该方法内部的this就代表谁
 * 
 * */
class Student{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;	
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("林青霞"); 
		s.setAge(27);
		String s1 = s.getName();
		int s2 = s.getAge();
		System.out.println("name: "+s1);
		System.out.println("age: "+s2);
	}

}
