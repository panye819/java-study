package lesson78_Set;


public class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;	
	}
	public String toString() {
		return "姓名： "+this.name +",年龄： "+this.age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(this.age>o.age) {
			return 1;
		}else if(this.age<o.age){
			return -1;
		}else {
			return this.name.compareTo(o.name);
		}
	}
	
}
