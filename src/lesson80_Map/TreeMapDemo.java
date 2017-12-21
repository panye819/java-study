package lesson80_Map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
public static void main(String[] args) {
	Map<String,Integer> map = new TreeMap<String,Integer>();
	map.put("D",40);
	map.put("A",10);
	map.put("C",30);
	map.put("D",50);
	map.put("B",20);

	System.out.println(map);
	}
}
