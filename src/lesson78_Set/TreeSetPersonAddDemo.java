package lesson78_Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPersonAddDemo {
public static void main(String[] args) {
	Set<Person> allSet = new TreeSet<Person>();
	allSet.add(new Person("Tom",30));
	allSet.add(new Person("Henry",30));
	allSet.add(new Person("Jack",31));
	allSet.add(new Person("Terry",32));
	allSet.add(new Person("Underwood",32));
	System.out.println(allSet);
}
}
