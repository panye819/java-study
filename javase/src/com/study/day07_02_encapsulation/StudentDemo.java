package com.study.day07_02_encapsulation;
/*
 * this:�ǵ�ǰ��Ķ������á��򵥵ļǣ����ʹ���ǰ��Ķ���
 * 
 * 		ע�⣺�������ĸ�������ã��ڸ÷����ڲ���this�ʹ���˭
 * 
 * */
class Student1{
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
		Student1 s = new Student1();
		s.setName("����ϼ"); 
		s.setAge(27);
		String s1 = s.getName();
		int s2 = s.getAge();
		System.out.println("name: "+s1);
		System.out.println("age: "+s2);
	}

}
