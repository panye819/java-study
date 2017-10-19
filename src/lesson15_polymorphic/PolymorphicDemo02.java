package lesson15_polymorphic;
/**
 * */
class A1{
	public void fun1() {
		System.out.println("1、A类 --> public void fun1(){}");
	}
	public void fun2() {
		this.fun1();
	}
}
class B1 extends A1{
	public void fun1() { //重写了方法
		System.out.println("2、B类 --> public void fun1(){}");
	}
	public void fun3() { //子类中自定义方法，父类中不存在
		System.out.println("3、B类 --> public void fun3(){}");
	}
}
public class PolymorphicDemo02 {
	public static void main(String[] args) {
		A1 a1= new A1();
		B1 b1 = (B1)a1;// java.lang.ClassCastException，表示类转换异常，产生原因是两个没有关系的
						//类进行相互对象转换操作，这种异常不会在编译阶段产生，只会在运行时抛出。
		b1.fun2();
	}

}
