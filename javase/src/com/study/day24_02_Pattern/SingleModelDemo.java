package com.study.day24_02_Pattern;

/**
 *	单例设计模式：
 *		单例设计模式就是要保证类在内存中只有一个对象，该实例必须自动创建，并对外提供。
 *	优点：
 *		在内存中只存在一个对象，这样可以节约系统资源，对于一些需要频繁创建和销毁的对象，单例模式可以提高系统性能。
 *	缺点：
 *		没有抽象层，因此扩展很难
 *		职责过重，在一定程度上违反了单一原则。
 *	如何保证类在内存中只有一个对象呢？
 *		1、构造方法私有
 *		2、在成员位置自己创建一个对象
 *		3、通过一个公共方法访问。
 *	
 */
public class SingleModelDemo {
	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		Student s2 = new Student();
//		System.out.println(s1==s2);
//		Student.s = null;
		
		Student s3 = Student.getStudent();
		Student s4 = Student.getStudent();
		System.out.println(s3==s4);
		System.out.println(s3);
		System.out.println(s4);
		
		
	}

}
