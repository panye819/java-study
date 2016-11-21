package com.study.InterfaceDemo;

/**
 * @author FlyPiG8308
 *接口的特点：
 *	1、接口用关键字interface表示
 *		interface 接口名 {}
 *	2、类实现接口用implements表示
 *		class 类名 implements 接口名{}
 *	3、接口不能实例化
 *		按照多态的方式来实例化
 *	4、接口的子类：
 *		可以是抽象类，但是意义不大
 *		可以是具体类，但是要重写接口中所有的抽象方法。（推荐方案）
 *接口的成员特点:
 *	成员变量：只能是常量，并且是静态的
 *			默认修饰符：public static final
 *	构造方法：接口没有构造方法，但所有的类都默认继承自一个类：object
 *			
 */
interface Inter{
	public int num = 10;
	public final int num2 = 20;
	
}
class InterImpl implements Inter{
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
//		i.num = 100;
//		i.num2 = 200;
////		System.out.println(i.num);
////		System.out.println(i.num2);
//		
		
	}

}
