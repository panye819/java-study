package lesson14_Interface;
/**
 * 接口：	
 * 		一个特殊的类，在Java中是由抽象方法和全局常量组成。
 * 		接口与抽象类一样，需要有子类，那么子类此时不再成为继承类，而是实现接口。通过implements
 * 		关键字完成。
 * */

interface INews{
	public String get();
}

abstract class AbstractMessage{
	public abstract void print();
	
}

class NewsImpl extends AbstractMessage implements INews{
	public String get() {
		return "www.mldn.cn";
	}
	public void print() {}

}
public class InterfaceDemo4{
	public static void main(String[] args) {
		INews news = new NewsImpl();
		System.out.println(news.get());
		
	}
}