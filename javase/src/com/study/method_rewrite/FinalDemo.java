package com.study.method_rewrite;

/**
 * 
 *不允许子类覆盖掉父类中的方法，这时Java提供了一个关键字final。
 *	final可以修饰类，该类不能被继承
 *	final可以修饰方法，该方法不能被重写
 *	final可以修饰变量，该变量不能被重新赋值，因为这个变量其实是常量
 *
 *
 */
class Fu{
	public final void show(){
		System.out.println("这里是绝密资源，任何人不能修改！");
	}
	
}
class Zi extends Fu{

	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("这是一堆垃圾！！！");
	}
	
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi();
		z.show();
		z.show1();

	}

}
