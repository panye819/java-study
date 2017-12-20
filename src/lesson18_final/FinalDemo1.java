package lesson18_final;
/**
 * 使用final关键字可以用作以下的声明：
 * 	1、声明类：声明的类不能有子类
 * 	2、声明方法：声明的方法不能被子类覆写
 * 	3、声明变量：声明的变量就变成了常量，常量是不可以被修改的
 * 				在Java中如果使用final声明一个常量的话，则常量的标识符必须全部大写
 * 
 * 
 * */
final class A{
	public void fun() {
		System.out.println("HAHAHAHA....");
	}
}

//下面的代码会报错，因为A被final修饰，是不能有子类的。
//class b extends A{
//	
//}
class B {
	public  void fun() {
		System.out.println("BBBBB......");
	}
}
class B1 extends B{
	public void fun() {
		System.out.println("B1.......");
	}
}

public class FinalDemo1 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.fun();
		
	}

}
