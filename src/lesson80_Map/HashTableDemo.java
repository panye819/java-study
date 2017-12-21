package lesson80_Map;

import java.util.Hashtable;
import java.util.Map;;



public class HashTableDemo {
public static void main(String[] args) {
	Map<String,Integer> map = new Hashtable<String,Integer>();
	map.put("A",10);
	map.put("B",20);
	map.put("C",30);
	map.put("D",40);
	map.put("D",50);
	System.out.println(map);
	
	}
}
