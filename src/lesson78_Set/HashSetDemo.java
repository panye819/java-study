package lesson78_Set;

import java.util.HashSet;
import java.util.Set;


public class HashSetDemo {
public static void main(String[] args) {
	Set<String> allSet = new HashSet<String>();
	allSet.add("C");
	allSet.add("D");
	allSet.add("A");
	allSet.add("B");
	allSet.add("C");
	allSet.add("C");
	allSet.add("E");
	allSet.add("A");
	allSet.add("D");
	System.out.println(allSet);
	}
}
