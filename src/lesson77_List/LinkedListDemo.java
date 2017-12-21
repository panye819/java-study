package lesson77_List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> link = new LinkedList<String>();
	link.add("A");
	link.add("B");
	link.add("C");
	link.addFirst("X");
	link.addLast("Y");
//	allList.remove(0);
	for(int i=0;i<link.size();i++) {
		System.out.println(link.element());
	}
	System.out.println("\nelement()操作之后："+link);
	for(int i=0;i<link.size();i++) {
		System.out.println(link.poll());
	}
	System.out.println("\npoll()操作之后："+link);
	System.out.println("-------------------------");
	System.out.println(link.contains("A"));
	System.out.println(link.contains("A1"));
	System.out.println("-------------------------");
	
	}
}
