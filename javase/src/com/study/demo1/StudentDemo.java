package com.study.demo1;
/*
 * this:�ǵ�ǰ��Ķ������á��򵥵ļǣ����ʹ���ǰ��Ķ���
 * 
 * 		ע�⣺�������ĸ�������ã��ڸ÷����ڲ���this�ʹ���˭
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
		s.setName("����ϼ"); 
		s.setAge(27);
		String s1 = s.getName();
		int s2 = s.getAge();
		System.out.println("name: "+s1);
		System.out.println("age: "+s2);
	}

}
