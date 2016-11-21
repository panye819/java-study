package com.study.abstactclass;

/**
 * @author FlyPiG8308
 *抽象类：
 *	把一个不是具体的功能称为抽象的功能，而如果一个类中包含了抽象的功能，那这个类就必须是抽象类。
 *特点：
 *	1、抽象类和抽象方法都必须用abstract修饰
 *	2、抽象类不一定要有抽象方法，但有抽象方法的一定是抽象类
 *	3、抽象类不能实例化
 *	4、抽象类中是有构造方法的，但是不能实例化，其作用是对父类进行数据初始化
 *抽象类的子类：
 *	1、如果不想重写父类中的抽象方法，抽象类的子类是必须是一个抽象类
 *	2、抽象类的子类重写了所有父类中的抽象方法，那么这个类是一个具体类。
 *抽象类的成员特点：
 *	1、成员变量：
 *		即可以是变量，也可以是常量
 *	2、构造方法：
 *		有，作用是用于子类访问父类数据的初始化
 *	3、成员方法：
 *		即可以是抽象的，也可以是非抽象的
 *abstract不能和哪些关键字共存：
 *	private 冲突
 *	final 冲突
 *	static 无意义
 */
abstract class Animal{
	public abstract void eat();
}
abstract class Dog extends Animal{}
abstract class Cat extends Animal{}
class Cat2 extends Animal{
	public  void eat(){
		System.out.println("猫吃鱼");
	}
}
public class AbstractClassDemo1 {
	public static void main(String[] args) {
		Cat2 c2 = new Cat2();
		c2.eat();
	}

}
