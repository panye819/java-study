package lesson14_Interface;
/**
 * 抽象类可以用于定义模板操作，接口呢？
 * 接口实际上是作为标准存在的，
 * */
interface A5 {
	public void fun();
}
class B5 implements A5{
	public void fun() {
		System.out.println("Hello");
	}
}
interface USB{
	public void start();
	public void stop();
	
}
class Computer{
	public static void plugin(USB usb) {
		usb.start();
		usb.stop();
	}
}
class Flash implements USB{
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Flash 开始工作了。。。");
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Flash 可以安全移除了。。。");
	}	
}
class Printer implements USB{
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("打印机 开始工作了。。。");
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("打印机 可以安全移除了。。。");
	}	
}
public class InterfaceDemo4{
	public static void main(String[] args) {
		A5 a5 = new B5();//为接口实例化
		a5.fun();
		System.out.println("---------------");
		USB u1 = new Flash();
		u1.start();
		u1.stop();
		System.out.println("---------------");
		USB u2 = new Printer();
		u2.start();
		u2.stop();
		
	}
}