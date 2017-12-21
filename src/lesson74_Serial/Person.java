package lesson74_Serial;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	private transient String gender;
	
	public Person(String name,int age,String gender) {
		this.name = name;
		this.age = age;	
	}
	public String toString() {
		return "姓名： "+this.name +",年龄： "+this.age;
	}
	
}
