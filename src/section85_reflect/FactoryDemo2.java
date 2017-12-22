package section85_reflect;

interface Fruit2{
	public void eat();
}
class Apple2 implements Fruit2{
	@Override
	public void eat() {
		System.out.println("吃苹果...");
	}
}
class Orange2 implements Fruit2{

	@Override
	public void eat() {
		System.out.println("吃橘子...");
		
	}
	
}
class Factory2{
	public static Fruit2 getInstance(String className) throws Exception{
		Fruit2 f = null;
		try {
			f = (Fruit2) Class.forName(className).newInstance();
		}catch(Exception e) {} 
		
		return f;
	}
}
public class FactoryDemo2 {
	public static void main(String[] args) throws Exception {
		Fruit2 f3 = Factory2.getInstance("section85_reflect.Apple2");
		f3.eat();
	}

}
