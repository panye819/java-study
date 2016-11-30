package com.study.day07_01_variable;

/**
 * 匿名对象：
 * 		就是没有名字的对象
 * 适用场景：
 * 		1、调用方法，仅仅调用一次的时候
 * 			匿名对象调用完毕就是垃圾，可以被垃圾回收器回收
 * 		2、可以作为参数传递
 *
 */
class Student2{
	public void show(){
		System.out.println("我爱学习");
	}
}
class Student2Demo{
	public void method(Student2 st2){
		st2.show();
	}
}
public class noNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 st2 = new Student2();
		//带名字的调用
		st2.show();
		System.out.println("-----");
		//匿名对象调用
		new Student2().show();
		System.out.println("-----");
		//作为实际参数传递
		Student2Demo s2d = new Student2Demo();
		s2d.method(new Student2());
		System.out.println("-----");
		new Student2Demo().method(st2);
	}

}
