package lesson79_CollectionOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorDemo {
public static void main(String[] args) {
	List<String> allList = new ArrayList<String>();
	allList.add("A");
	allList.add("B");
	allList.add("C");
	allList.add("D");
	allList.add("E");
	ListIterator<String> iter = allList.listIterator();
	iter.add("X");
	System.out.print("从前向后输出：");
	while(iter.hasNext()) {
		String str = iter.next();
		iter.set(str+"- JSHX");
		System.out.print(str+"、");	
	}
	System.out.println("");

	System.out.print("从后向前输出：");
	while(iter.hasPrevious()) {
		System.out.print(iter.previous()+"、");	
	}
	
	}
}
