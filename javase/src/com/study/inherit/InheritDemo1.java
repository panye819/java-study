package com.study.inherit;

/**
 * @author bluebell325
 *继承概述：
 *	多个类中存在相同的属性和行为时，将这些内容抽取到单独的一个类中，那么多个类无需 再定义这些行为和属性，只要继承这个类即可。
 *	通过extends关键字，可以实现类与类的继承。
 *		class 子类名 extends 父类名{}
 *		单独的这个类称为父类、基类或者超类；
 *		这多个类可以称为子类或者派生类。
 *	有了继承以后，我们定义一个类的时候可以在一个已经存在的类的基础上，还可以定义自己的新成员。
 *继承的好处：
 *	a、提高了代码的复用性
 *	b、提高了代码的维护性
 *	c、让类与类之间产生了关系，这是产生多态的前提
 *
 *继承的弊端：
 *	a、类的耦合性增强了
 *		耦合与内聚
 *			耦合：类与类的关系。			
 *			内聚：就是自己完成某个功能的能力
 *	b、 
 *	c、 
 *
 *Java中继承的特点：
 *	Java中只支持单继承，不支持多继承
 *	Java支持多层继承
 *Java中继承的注意事项
 *	a、子类只能继承父类中所有非私有的成员（成员方法和成员变量）
 *	b、子类不能继承父类中的构造方法，但是可以通过super关键字去访问父类中的构造方法
 *	c、不要为了部分功能而去继承	
 *
 *什么时候考虑使用继承：	
 *	继承体现是一种关系，子类是父类的一种，符合这个条件的时候就可以考虑使用继承。
 *
 *继承中成员变量的关系：
 *	在子类方法中访问一个变量的查找顺序：
 *		a、在子类方法的局部范围中查找，有就使用
 *		b、在子类的成员范围中查找，有就使用
 *		c、在父类方法的成员范围中查找，有就使用（肯定不能访问父类的局部范围）
 *		d、如果还是没有就报错。
 * */
class Person{
	String name;
	int age;
	int x = 10;
	public void eat(){
		System.out.println("去吃饭......");
	}
	public void sleep(){
		System.out.println("去睡觉......");
	}
}
class Student extends Person{
	public void show(){
		System.out.println("I am a student......");
	}
	
}
class Teacher extends Person{
	public void show(){
		System.out.println("I am a teacher");
	}
	
	
}
	public class InheritDemo1 {
	public static void main(String[] args) {
//		System.out.println("hi inherit!");
		
		Student s1 = new Student();
		s1.eat();
		s1.sleep();
		s1.show();
		System.out.println("---------------------");
		Teacher t1 = new Teacher();
		t1.eat();
		t1.sleep();
		t1.show();
		
	}

}
