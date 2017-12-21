package lesson79_CollectionOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ForeachDemo {
public static void main(String[] args) {
	List<String> allList = new ArrayList<String>();
	allList.add("A");
	allList.add("B");
	allList.add("C");
	allList.add("D");
	allList.add("E");
	for(String str:allList) {
		System.out.print(str+"、");
	}
	
	}
}
