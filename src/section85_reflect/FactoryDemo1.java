package section85_reflect;

interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃苹果...");
	}
}
class Orange implements Fruit{

	@Override
	public void eat() {
		System.out.println("吃橘子");
		
	}
	
}
class Factory{
	public static Fruit getInstance(String className) throws Exception{
		Fruit f = null;
		if("apple".equals(className)) {
			f = new Apple();
		}
		if("orange".equals(className)) {
			f = new Orange();
		}
		return f;
	}
}
public class FactoryDemo1 {
	public static void main(String[] args) throws Exception {
		Fruit f = Factory.getInstance("apple");
		f.eat();
		Fruit f2 = Factory.getInstance("orange");
		f2.eat();
		
	
	}

}
