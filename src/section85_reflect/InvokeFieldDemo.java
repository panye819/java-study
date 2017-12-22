package section85_reflect;

import java.lang.reflect.Field;


public class InvokeFieldDemo {
	public static void main(String[] args) throws Exception {
		Class<?> c = Class.forName("section85_reflect.Person2");
		Object obj = c.newInstance();
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "JSHX");
		System.out.println(nameField.get(obj));
	
	}


}
