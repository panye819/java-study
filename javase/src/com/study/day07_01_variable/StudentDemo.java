package com.study.day07_01_variable;
/*封装概述：
 * 	是指隐藏对象的实现细节，仅对外提供公共访问方式
 * 
 *好处：
 *	隐藏实现细节，提供公共访问方式
 *	提高了代码的复用性
 *	提高了安全性
 *
 *封装原则：
 *	将不需要对外提供访问的内容都隐藏起来
 *	把属性隐藏，提供公共的方法对其访问
 * 
 * private关键字：
 * 	是一个权限修饰符
 * 	可以修饰成员变量和成员方法
 * 	被其修饰的成员只能在本类中被访问
 */

class Student{
	String name;
	private int age;
	
	public void setAge(int a){
		if (a < 0 || a >120){
			System.out.println("你给的年龄有问题");
		}else{
			age = a;
		}
	}
	public void show(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}	
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "林青霞";
//		s.age = -27;
		s.setAge(27);
		s.show();
		
	}

}
