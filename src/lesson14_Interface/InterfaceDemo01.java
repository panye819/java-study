package lesson14_Interface;
/**
 * 接口：	
 * 		一个特殊的类，在Java中是由抽象方法和全局常量组成。
 * 		接口与抽象类一样，需要有子类，那么子类此时不再成为继承类，而是实现接口。通过implements
 * 		关键字完成。
 * */
interface A{
	public static final String INFO = "CHINA";//全局常量
	//定义了两个抽象方法
	public abstract void print();
	public abstract void fun();
}
interface C{
	public abstract void funA();
}
class B implements A,C{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("HELLO WORLD!!!");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println(INFO);
	}

	@Override
	public void funA() {
		System.out.println("Interface C funA() "+INFO);
		
	}
	
}
public  class InterfaceDemo01 {
	public static void main(String[] args) {
		B b = new B();
		b.print();
		b.fun();
		b.funA();
	}
}
