package com.study.inherit;
/**
 * this代表本类对应的引用
 * super代表父类存储空间的标识，也可以理解为父类的引用
 * 
 *
 */

class Father{
	public int num = 2;
}

class Son extends Father{
	public int num = 20;
	public void show(){
		int num = 200;
		System.out.println("num: "+num);
		System.out.println("this.num: "+this.num);
		System.out.println("super.num: "+super.num);
	}
}

public class InheritDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s1 = new Son();
		s1.show();
		
	}

}
