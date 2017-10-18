package lesson14_Interface;
/**
 * 如果一个类既要实现接口又要继承抽象类的话，则必须按照以下的形式完成：
 * 	class 子类 extends 抽象类 implements 接口 A,接口B,...{};
 * 
 * */
interface A1{
	public abstract void printA();
}
interface B1{
	public abstract void printB();
}
abstract class C1{
	public abstract void printC();
}
class X extends C1  implements A1,B1{

	@Override
	public void printB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printC() {
		// TODO Auto-generated method stub
		
	}

	
	
}
public  class InterfaceDemo02 {
	public static void main(String[] args) {
		B b = new B();
		b.print();
		b.fun();
		b.funA();
	}
}
