package lesson78_Set;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo {
public static void main(String[] args) {
	Set<String> allSet = new TreeSet<String>();
	allSet.add("A");
	allSet.add("B");
	allSet.add("C");
	allSet.add("C");
	allSet.add("C");
	allSet.add("D");
	allSet.add("E");
	allSet.add("A");
	allSet.add("D");
	System.out.println(allSet);
	}
}
