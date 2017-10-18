package lesson10_InnerClass;
/**
 * 内部类（重点）：
 * 		在一个类的内部还有另外一个类。
 *
 */
class Outer{
	private String name = "Hello World!";
	class Inner{
		public void print() {
			System.out.println("name = "+name);
		}
	}
	public void fun() {
		new Inner().print();
	}
}
public class InnerClassDemo01 {
	public static void main(String[] args) {
		new Outer().fun();
	}
}
