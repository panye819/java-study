package com.study.day08_02_inherit;

/**
 * @author bluebell325
 * 
 *如果子类中的方法与父类中的方法名称重复：
 *		通过子类调用方法：
 *			1、先查找子类，如果子类中有就是用
 *			2、如果子类中没有，就去父类中查找，如果有就使用
 *			3、如果都没有就报错
 */
class Demo6Father {
	public void show(){
		System.out.println("show Demo6Father");
	}
}
class Demo6Son extends Demo6Father{
	public void method(){
		System.out.println("method Demo6Son");
		
		
	}
	public void show(){
		System.out.println("show Demo6Son");
	}
}
public class InheritDemo6 {
	public static void main(String[] args) {
		Demo6Son d6 = new Demo6Son();
		d6.show();
		d6.method();
//		d6.sit();
	}

}
