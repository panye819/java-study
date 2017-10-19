package lesson15_polymorphic;
/**
 * 多态：
 * 	同一个事物在不同时刻表现出来的不同形态。
 * 	多态的前提和实现
 * 		1、有继承关系
 * 		2、有方法的重写
 * 			其实没有也是可以的，但是没有这个就没有意义
 * 		3、有父类引用指向子类对象
 * 			父类 f = new 子类；
 *	多态中成员访问特点：
 *		1、成员变量：
 *			编译看左边，运行看左边
 *		2、构造方法
 *			创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化
 *		3、成员方法
 *			编译看左边，运行看右边
 *		4、静态方法
 *			编译看左边，运行看左边（静态和类相关，算不算重写，访问还是左边）
 *	多态的特征：
 *		1、方法的重载和方法的重回写实际上就是属于多态性的一种体现
 *		2、真正的多态性还包含了一种称为对象多态性的概念。
 *			对象多态性主要指的是，子类和父类对象的相互转换关系
 *				向上转型：父类 父类对象 = 子类实例   		->自动完成
 *				向下转型：子类 子类对象 = （子类）父类实例	->强制完成
 * */
class A{
	public void fun1() {
		System.out.println("1、A类 --> public void fun1(){}");
	}
	public void fun2() {
		this.fun1();
	}
}
class B extends A{
	public void fun1() { //重写了方法
		System.out.println("2、B类 --> public void fun1(){}");
	}
	public void fun3() { //子类中自定义方法，父类中不存在
		System.out.println("3、B类 --> public void fun3(){}");
	}
}
public class PolymorphicDemo01 {

	public static void main(String[] args) {
//		B b = new B();
//		b.fun2();
//		a.fun2();
//		a.fun3();//这个语句执行会报错，因为在A的方法中是没有fun3()这个方法的。
		A a = new B();//发生向上转型关系，子类实例-->父类实例
		B b = (B)a;//发生向下转型，强制
		b.fun2();
		b.fun3();

	}

}
