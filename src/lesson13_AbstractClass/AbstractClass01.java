package lesson13_AbstractClass;
/**
 * 抽象类：
 * 		包含一个抽象方法的类称为抽象类
 * 		抽象方法是只声明而未实现的方法，所有的抽象方法必须使用abstract关键字声明
 * 		所有的抽象类也需要使用abstract关键字声明
 * 		对于抽象类来讲，不能直接进行实例化的操作，但是可以声明，如果要想使用抽象类，则必须依靠
 * 		子类，抽象类是必须被子类继承的，而且被继承的子类需要实现抽象类中的全部抽象方法。
 * 思考：
 * 		1、抽象类能否使用final声明？
 * 			肯定不行，因为抽象类必须被子类继承，而用final关键字声明的类是无法被继承的
 * 		2、抽象类中能不能存在构造方法？
 * 			抽象类中允许有构造方法，但是此构造方法是不能直接调用的，是由子类调用的，子类对象的实例
 * 			化过程中，永远是先调用父类中的构造方法。
 * 	实际上来说，抽象类就是比普通类多了一个抽象方法而已。		
 * */
abstract class A{
	private String name;
	public A(String name) {
		this.name = name;
		System.out.println("****************");
	}//构造方法
	public String getName() {
		return this.name;
	}
	public abstract void fun();
}
class B extends A{ //继承抽象类
	public B(String name) {
		super(name);
		System.out.println("BBBBBBBBBBBBBBBB");
	}
	public void fun() { //覆写方法时需要注意访问控制权限
		System.out.println(super.getName());
	}
}
public class AbstractClass01 {
	public static void main(String[] args) {
		B b = new B("Tom");
		b.fun();
	}
}
