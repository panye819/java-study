package com.study.day09_polymorphic;

/**
 * 多态：
 * 	同一个事物在不同时刻表现出来的不同形态。
 * 	多态的前提和实现
 * 		1、有继承关系
 * 		2、有方法的重写
 * 			其实没有也是可以的，但是没有这个就没有意义
 * 		3、有父类引用指向子类对象
 * 			父类 f = new 子类；
 *	多态中成员访问特点：
 *		1、成员变量：
 *			编译看左边，运行看左边
 *		2、构造方法
 *			创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化
 *		3、成员方法
 *			编译看左边，运行看右边
 *		4、静态方法
 *			编译看左边，运行看左边（静态和类相关，算不算重写，访问还是左边）
 */
class Fu{
	public int num = 100;
	public Fu(){
		System.out.println("Fu构造方法");
	}
	public void show(){
		System.out.println("show Fu");
	}
	public static void method(){
		System.out.println("method Fu");
	}
}
class Zi extends Fu{
	public int num = 1000;
	public int num2 = 200;
	public void show(){
		System.out.println("show Zi");
	}
//	public void method(){
//		System.out.println("method Zi");
//	}
	public static void method(){
		System.out.println("method Zi");
	}
}

public class PolymorphicDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fu f = new Zi();
		f.show();
		f.method();
		System.out.println(f.num);
//		System.out.println(f.num2);

		
	}

}
