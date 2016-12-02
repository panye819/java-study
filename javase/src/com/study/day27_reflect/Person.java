package com.study.day27_reflect;

public class Person {
	private String name;
	int age;
	public String address;
	
	public Person(){}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	public Person(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void show(){
		System.out.println("show method");
	}
	public void method(String s){
		System.out.println("method :"+s);
	}
	public String getString(String s,int i){
		return s+"----"+i;
	}
	private void function(){
		System.out.println("function");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
