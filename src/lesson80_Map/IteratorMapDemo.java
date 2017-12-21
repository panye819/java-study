package lesson80_Map;

import java.util.HashMap;
import java.util.Map;


public class IteratorMapDemo {
public static void main(String[] args) {
	Map<String,Person> map = new HashMap<String,Person>();
	//Map中可以使用匿名对象找到一个key对于的value
	map.put("AA", new Person("A",10));
	map.put("BB", new Person("B",20));
	map.put(new String("CC"), new Person("C",30));
	map.put("DD", new Person("D",40));
	System.out.println(map.get(new String("CC")));
	System.out.println("");
	
	//但是如果调换了顺序，就找不到value了
	//这时候需要Person类覆写equals()和hashcode()方法
	Map<Person,String> map2 = new HashMap<Person,String>();
	map2.put(new Person("E",50), "EE");
	System.out.println(map2.get(new Person("E",50)));
	
	}
}
