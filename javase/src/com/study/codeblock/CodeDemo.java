package com.study.codeblock;

/**
 * 在Java中，使用{}括起来的代码被称为代码块
 * 	根据位置和声明不同，可以分为
 * 	1、局部代码块
 * 		在方法中出现，局部位置，用于限定变量的生命周期
 * 	2、构造代码块
 * 		在构造方法的位置，在类中方法外出现，把多个构造方法中相同的代码放在一起，用{}括起来，每次调用构造方法都执行，并且在构造方法之前执行。
 * 		作用：
 * 			把多个构造方法中的共同代码放在一起
 * 	3、静态代码块
 * 		在类中的成员位置，用{}括起来，只不过它用static修饰了，
 * 		作用：
 * 			一般是对类进行初始化
 * 代码块的执行顺序：
 * 		静态代码块--->构造代码块--->构造方法，并且静态代码块只执行一次。
 *
 */
class Code{
	
	static {
		int z = 1000;
		System.out.println("z: "+z);
		System.out.println("我是静态代码块1");
	}
	
	{
		int n = 10010;
		System.out.println("n: "+n);
		System.out.println("我是构造代码块3");
	}
	
	{
		int y=20;
		System.out.println("y: "+y);
		System.out.println("我是构造代码块1");
	}
	
	
	public Code(){
		System.out.println("Code");
		
	}
	public Code(int a){
		System.out.println("Code+1");
	}
	
	{
		int y1=30;
		System.out.println("y1: "+y1);
		System.out.println("我是构造代码块2");
	}
	
	static {
		int m = 10086;
		System.out.println("m: "+m);
		System.out.println("我是静态代码块2");
		}
}

public class CodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			{
//				int x = 10;
//			}
		 	int x = 10;
			System.out.println("x: "+x);
			
			Code c1 = new Code();
			System.out.println("--------------------");
			Code c2 = new Code();
			System.out.println("--------------------");
			Code c3 = new Code(1);
			
			
			
	}

}
