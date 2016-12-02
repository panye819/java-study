package com.study.day09_polymorphic;

/**
 * @author bluebell325
 *多态的弊端
 *	不能使用子类特有的方法
 *		解决办法：
 *			1、创建子类的对象调用方法即可。（可以，但是很多时候不合理，而且，太占内存了。）
 *			2、把父类的引用强制转换为子类的引用。（向下转型）
 *				对象间转型的问题：
 *					向上转型：DemoFu df = new DemoZi();
 *					向下转型：DemoZi dz = (DemoZi) df;//要求该df必须是能够转换为DemoZi的。
 */
class DemoFu{
	public void show(){
		System.out.println("show DemoFu");
	}
}
class DemoZi extends DemoFu{
	public void show(){
		System.out.println("show DemoZi");
	}
	public void method(){
		System.out.println("method DemoZi");
	}
}
public class PolymorphicDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoFu df = new DemoZi();
		df.show();
//		df.method();
		
		DemoZi dz =(DemoZi)df;
		dz.show();
		dz.method();
		
		
	}

}
