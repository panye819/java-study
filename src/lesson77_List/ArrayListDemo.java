package lesson77_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	List<String> allList = new ArrayList<String>();
	allList.add("hello");
	allList.add(0, "JSHX");
	allList.add("world");
	allList.add("!!!!");
//	allList.remove(0);
	for(int i=0;i<allList.size();i++) {
		System.out.println("在列表allList "+i+"位置的元素是："+allList.get(i));
	}
	System.out.println("-------------------------");
	System.out.println(allList.contains("hello"));
	System.out.println(allList.contains("hello1"));
	System.out.println("-------------------------");
	List<String> subList = allList.subList(1,3);
	for(int i=0;i<subList.size();i++) {
		System.out.println("在列表subList "+i+"位置的元素是："+subList.get(i));
		}
	}
}
