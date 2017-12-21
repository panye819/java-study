package lesson80_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMapDemo2 {
public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("A",10);
	map.put("B",20);
	map.put("C",30);
	map.put("D",40);
	map.put("D",50);
	Collection<Integer> col = map.values();
	Iterator<Integer> iter = col.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
		}
	}
}
