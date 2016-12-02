package com.study.day07_02_encapsulation;

/**
 * 	封装：
 * 		概述：隐藏对象的属性和实现细节，仅对外提供公共访问方式。
 * 		好处：
 * 			隐藏了实现细节，仅提供公共访问方式
 * 			提高了代码的复用性
 * 			提高安全性
 * 		原则：
 * 			把不需要对外提供的内容都隐藏起来。
 * 			把属性隐藏，提供公共方法对其访问。
 * 			
 *
 */
class Student{
	String name;
	private int age;
	/**
	 * 强制使用方法给age赋值，而不能直接给age赋值。使用private关键字
	 * private 可以修饰成员变量和成员方法
	 * 	被private修饰的成员只能在本类中访问
	 * 	提供对应的setXXX()和getXXX()方法
	 */
	public void setAge(int a){
		if(a>0 && a<120){
			age = a;
		}else{
			System.out.println("你提供的年龄非法，范围为1~120");
		}
	}
	public void show(){
		System.out.println("name is :"+name);
		System.out.println("age is :"+age);
	}
}
public class EncapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.show();
		System.out.println("--------------");
		//给成员变量赋值
		s.name = "诸葛亮";
		s.setAge(38);
		System.out.println("--------------");
		//给age赋值
//		s.age = -27;//这个赋值是不合法的
		s.setAge(-27);
		s.show();
		
				
	}

}
