package lesson14_Interface;
/**
 * 一个抽象类可以实现多个接口，但一个接口不能继承一个抽象类。
 * 一个接口虽然不可以继承一个抽象类，但是一个接口却可以同时继承多个接口。
 * 		这一点在以后的高级开发中会经常见到。
 * */
interface A2{
	public  void printA2();
}
interface B2{
	public  void printB2();
}
interface Z extends A2,B2{
	public void  printZ();
}
abstract class C2 implements A2,B2{
	public abstract void printC2();
}
class X3 extends C2{

	@Override
	public void printA2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printB2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printC2() {
		// TODO Auto-generated method stub
		
	}

	
}
public  class InterfaceDemo03 {
	public static void main(String[] args) {
		

	}
}
