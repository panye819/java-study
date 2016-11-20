package com.study.method_rewrite;

/**
 * 
 *不允许子类覆盖掉父类中的方法，这时Java提供了一个关键字final。
 *	final可以修饰类，该类不能被继承
 *	final可以修饰方法，该方法不能被重写
 *	final可以修饰变量，该变量不能被重新赋值，因为这个变量其实是常量
 *		final修饰局部变量：
 *			1、局部变量为基本类型时，该变量不能被重新赋值
 *			2、局部变量为引用类型时，该变量地址值不能被改变，但该对象的堆内存的值是可以改变的。
 *	final修饰变量的初始化时机：
 *		1、被final修饰的变量只能赋值一次
 *		2、在构造方法完毕前。（非静态的常量）
 *
 *
 */
class Student{
	int age = 10;
	public final void show(){
		System.out.println("这里是绝密资源，任何人不能修改！");
	}
	
}
//class Zi extends Fu{
//
//	public void show1() {
//		// TODO Auto-generated method stub
//		System.out.println("这是一堆垃圾！！！");
//	}
//	
//}

public class FinalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println("age is : "+s.age);
		s.age = 100;
		System.out.println("age is : "+s.age);
		System.out.println("------------------------");
		Student ss = new Student();
		System.out.println("age is : "+ss.age);
		ss.age = 100;
		System.out.println("age is : "+ss.age);
	
		System.out.println("------------------------");
		final Student ss1 = new Student();
		System.out.println("age is : "+ss1.age);
		ss1.age = 300;
		System.out.println("age is : "+ss1.age);
		//2、局部变量为引用类型时，该变量地址值不能被改变。
//		ss1 = new Student();//报错

		
	}

}
