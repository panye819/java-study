package section85_reflect;

import java.lang.reflect.Constructor;

public class InstanceDemo1 {
	public static void main(String[] args) throws Exception {
		Class<?> c = null;
		Person per = null;
		c = Class.forName("section85_reflect.Person");
		Constructor<?> cons[] = c.getConstructors();//得到全部的构造方法
		per = (Person) cons[0].newInstance("Tom",33);
		System.out.println(per);
		
		
	}

}
