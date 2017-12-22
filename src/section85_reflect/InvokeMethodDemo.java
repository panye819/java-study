package section85_reflect;

import java.lang.reflect.Method;

public class InvokeMethodDemo {
	public static void main(String[] args) throws Exception {
		Class<?> c = Class.forName("section85_reflect.Person2");
		System.out.println("调用类中无参数无返回值的的sayHello()方法");
		Method m = c.getMethod("sayHello");
		m.invoke(c.newInstance());
	
		System.out.println("调用类中带参数带返回值的的say()方法");
		Method m2 = c.getMethod("say", String.class,String.class);
		String val  = (String) m2.invoke(c.newInstance(), "PY","欢迎光临");
		System.out.println(val);
		
		System.out.println("调用类中的setter和getter方法");
//		System.out.println(initStr("jshx"));
		Object o = c.newInstance();
		set("name","jshx",o,String.class);
		set("age",30,o,int.class);
		get("age",o);
//		System.out.println(o);
		
	}
	public static void set(String name,Object value,Object obj,Class<?> type) throws Exception{
		Method met = obj.getClass().getMethod("set"+initStr(name), type);
		met.invoke(obj, value);
	}
	public static void get(String name,Object obj) throws Exception{
		Method met = obj.getClass().getMethod("get"+initStr(name));
		Object value = met.invoke(obj);
		System.out.println(value);

	}
	private static String initStr(String name) {
		StringBuffer buf = new StringBuffer();
		buf.append(name.substring(0, 1).toUpperCase()).append(name.substring(1));
		return buf.toString();
	}

}
