package com.study.day07_02_construction;
/**
 * @author bluebell325
 *
 *针对多个对象有共同的成员变量值的时候，Java就提供了一个关键字来修饰：static，其修饰的数据是被所有对象共享的
 *特点：
 *	1、随着类的加载而加载
 *	2、优先于对象存在
 *	3、被所有对象共享
 *
 *注意事项：
 *	1、静态方法中是没有this关键字的
 *		理解：
 *			静态是随着类的加载而加载，而this是随着对象的创建而存在，静态比对象先存在。
 *	2、静态方法只能访问静态的成员变量和静态的成员方法。
 *		静态方法：
 *			成员变量：只能访问静态变量
 *			成员方法：只能访问静态方法
 *		非静态方法：
 *			成员变量：可以是静态的，也可以是非静态的
 *			成员方法：可以是静态的，也可以是非静态的
 *	静态的只能访问静态，非静态可以访问一切
 *	
 *
 */

class Person{
	String name;
	int age;
	static String country;
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Person(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
		
	}
	public void show(){
		System.out.println("姓名:"+name+"  年龄:"+age+"  国籍:"+country);
	}
	
	
}
public class PersonDemo {
	public static void main(String[] args) {
//		Person p1 = new Person("凤姐",27,"中国");
//		p1.show();
//		Person p2 = new Person("兽兽",28,"中国");
//		p2.show();
//		Person p3 = new Person("露露",29,"中国");
//		p3.show();
		Person p1 = new Person("凤姐",27,"中国");
		p1.show();
		Person p2 = new Person("兽兽",28);
		p2.show();
		Person p3 = new Person("露露",29);
		p3.show();
		
		p3.country = "美国";
		p3.show();
		p1.show();
		p2.show();
	}

}
