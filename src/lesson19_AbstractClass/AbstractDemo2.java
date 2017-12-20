package lesson19_AbstractClass;
/**
 * 从对象多态性的概念上来看，子类为父类实例化是一个比较容易的操作，因为可以发生自动的向上转型关系
 * 那么调用的方法永远是被子类覆写过的方法
 * */
abstract class A2{
	public abstract void fun();
}
class B2 extends A2{
	public void fun() {
		System.out.println("Hello");
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a2 = new B2();
		a2.fun();
	}

}
