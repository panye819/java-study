package com.study.inherit;

/**
 *  
 *继承中构造方法的关系：
 *	1、子类中所有的构造方法默认都会访问父类中无参的构造方法
 *		因为子类会继承父类中的数据，可能还会使用父类中的数据，所以，子类初始化之前一定要完成父类数据的初始化，
 *		注意：
 *			子类每一个构造方法的第一条默认语句都是：super(),
 *			如果不是写在第一条，会报Constructor call must be the first statement in a constructor错误
 *	2、如果父类中没有无参构造方法，子类的构造方法会报错
 *		解决办法：
 *			1、可以在父类中提供一个无参构造方法
 *			2、通过使用super关键字去显式的调用父类的带参构造方法
 *			3、子类通过this关键字去调用本类的其他构造方法
 *				子类一定要有一个去访问了父类的构造方法，否则父类数据就没有初始化。
 *			4、一个类的初始化过程：
 *				成员变量初始化：
 *					默认初始化------显式初始化-----构造方法初始化
 */
class TestFather{
//	public Test(){
//	System.out.println("TestFather的带参构造方法");
//	}
	public TestFather(String name){
//		System.out.println("name: "+name);
		System.out.println("TestFather的带参构造方法");
	}
}
class TestSon extends TestFather{
	public TestSon(){
		super("随便给");
		System.out.println("TestSon的无参构造方法");
	}
	public TestSon(String name){
		super("随便给");
		System.out.println("TestSon的带参构造方法。");
	}
	
}
class Father1{
	public Father1(){
		System.out.println("father的无参构造方法");
	}
	public Father1(int a){
		System.out.println(a);
		System.out.println("father的有参构造方法");
	}
	
}
class Son1 extends Father1{
	public Son1(){
		System.out.println("son的无参构造方法");
//		super();
	}
	public Son1(int a){
		System.out.println("a: "+a);
		System.out.println("son的带参构造方法");
	}
	public void show(){
		System.out.println("I am a son!");
	}
}
public class InheritDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son1 s1 = new Son1();
		s1.show();
		System.out.println("----------------------");
		Son1 s2 = new Son1(1);
		s2.show();
		System.out.println("---------------");
		TestSon td = new TestSon("林青霞");
		
		
	}

}
