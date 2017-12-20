package lesson14_Interface;
/**
 * 当一个类实现一个接口时，需要覆写其所有的抽象方法，但是选择希望可以根据自己的需要来选择性的
 * 覆写，该如何实现？
 * 用一个抽象类先实现接口，但是所有的方法都属于空实现，之后再继承此类。
 * 
 * */

interface Window{
	public void open();
	public void close();
	public void icon();
	public void unicon();
}

abstract class WindowAdapter implements Window{
	@Override
	public void open() {}

	@Override
	public void close() {}

	@Override
	public void icon() {}

	@Override
	public void unicon() {}

}

class MyWindow extends WindowAdapter {
	public void open() {
		System.out.println("打开窗口。。。");
	}
}
public class InterfaceAdapterDemo{
	public static void main(String[] args) {
		Window win = new MyWindow();
		win.open();	
	}
}