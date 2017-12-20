package lesson27_anonyInnerClass;
/** 
 * 
 * */
interface A{
	public void fun();
}

//class B implements A{
//	public void fun() {
//		System.out.println("Hello World!!!");
//	}
//}
//上面的代码中，如果B只使用一次，还单独定义了一个类，有点浪费，可以使用匿名内部类

/**在一般的开发中匿名内部类使用较少，以下两种情况会经常使用匿名内部类：
 *  1、Java的图形界面
 *  2、Spring开发框架
 * */


class X{
	public void fun1 (A a) {
		a.fun();
	}
	public void fun2() {
		this.fun1(new A() {
			public void fun() {
				System.out.println("Hello World!!!");
				
			}
		});
	}
}

public class AnonyInnerClassDemo1 {
	public static void main(String[] args) {
	new X().fun2();
	}
}

