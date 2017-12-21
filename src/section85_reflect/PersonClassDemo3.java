package section85_reflect;

public class PersonClassDemo3 {
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("section85_reflect.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.getName());
	}

}
