package section85_reflect;

public class ReflectDemo {
	static {
		b = 6;
		System.out.println("------------");
	}
	static int a = 5;
	static int b = 9;
	static int c;
	public static void main(String[] args) {
		System.out.println(ReflectDemo.b);
	}

}
