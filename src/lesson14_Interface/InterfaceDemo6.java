package lesson14_Interface;
/**
 * 接口：	
 * 		一个特殊的类，在Java中是由抽象方法和全局常量组成。
 * 		接口与抽象类一样，需要有子类，那么子类此时不再成为继承类，而是实现接口。通过implements
 * 		关键字完成。
 * 在开发中绝对不要去继承一个已经实现好的类，而要实现接口或者继承抽象类，其中以接口为优先使用，
 * 可以避免单继承的局限性。
 * */

interface Fruit{
	public void eat();
}

class Apple implements Fruit{
	public void eat() {
		System.out.println("吃苹果。。。");
	}	
}
class Orange implements Fruit{
	public void eat() {
		System.out.println("吃橘子。。。");
	}
}
class Factory{
	public static Fruit getFruit(String className) {
		Fruit f = null;
		//当遇到字符串比较时，通常将常量放在表达式的前面，这样可以避免空指针异常
		if("apple".equals(className)) {
			f = new Apple();
		}
		if("orange".equals(className)) {
			f= new Orange();
		}
		return f;
	}
}
public class InterfaceDemo6{
	public static void main(String[] args) {
		Fruit f1 = Factory.getFruit("apple");
		if (f1!=null) {
			f1.eat();
		}else {
			System.out.println("No Apple!!!");
		}
		Fruit f2 = Factory.getFruit("orange");
		if (f2!=null) {
			f2.eat();
		}else {
			System.out.println("No Orange!!!");
		}
		Fruit f3 = Factory.getFruit("banana");
		if (f3!=null) {
			f3.eat();
		}else {
			System.out.println("No Banana!!!");
		}

	}
}