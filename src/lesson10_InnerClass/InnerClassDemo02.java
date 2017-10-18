package lesson10_InnerClass;
/**
 * 内部类（重点）：
 * 		在一个类的内部还有另外一个类。
 *		内部类的唯一优点在于：可以方便的访问外部类中的私有成员。
 */
class Outer1{
	private String name = "Hello World!";
	
	public void fun() {
		new Inner(this).print();
	}
	public String getName() {
		return this.name;
	}
}
class Inner{
	private Outer1 out1;
	public Inner(Outer1 out1) {
		this.out1 = out1;
	}
	public void print() {
		System.out.println("name = "+this.out1.getName());
	}
}
public class InnerClassDemo02 {
	public static void main(String[] args) {
		new Outer1().fun();
	}
}
