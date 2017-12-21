package lesson80_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMapDemo {
public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("A",10);
	map.put("B",20);
	map.put("C",30);
	map.put("D",40);
	map.put("D",50);
	System.out.println(map);
	Integer value = map.get("D");
	System.out.println("The value of D is : "+value);
	Set<String> set = map.keySet();
	Iterator<String> iter = set.iterator();
//	while(iter.hasNext()) {
//		System.out.println(iter.next());
//	}
	System.out.println("");
	while(iter.hasNext()) {
		String key = iter.next();
		System.out.println(key+"-->"+map.get(key));
	}
	
	
	}
}
