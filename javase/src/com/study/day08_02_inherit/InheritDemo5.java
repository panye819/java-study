package com.study.day08_02_inherit;

/**
 * @author bluebell325
 * 
 *一个类的静态代码块、构造代码块、构造方法的执行流程
 *		静态代码块----构造代码块----构造方法
 *静态代码块是随着类的加载而加载，会优先执行
 *子类初始化之前会先进行父类的初始化（分层初始化）
 *		虽然子类构造方法中默认有super()语句，但初始化的时候不是按照那个顺序进行的
 *		而是按照分层初始化进行的，它仅仅表示要先初始化父类数据，然后在初始化子类数据
 *所以结果为：
 *静态代码块Fu1
 *静态代码块Zi1
 *构造代码块Fu1
 *构造方法Fu1
 *构造代码块Zi1
 *构造方法Zi1
 */
class Fu1{
	static {
		System.out.println("静态代码块Fu1");
	}
	{
		System.out.println("构造代码块Fu1");
	}
	public Fu1(){
		System.out.println("构造方法Fu1");
	}
}
class Zi1 extends Fu1{
	static {
		System.out.println("静态代码块Zi1");
	}
	{
		System.out.println("构造代码块Zi1");
	}
	public Zi1(){
		System.out.println("构造方法Zi1");
	}
	public void show(){
	}
}
public class InheritDemo5 {
	public static void main(String[] args) {
		Zi1 z = new Zi1();
	}

}
