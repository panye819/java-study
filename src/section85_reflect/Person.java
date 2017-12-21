package section85_reflect;

public class Person {
	private String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	private int age;
	public Person(String name,int age) {
		this.setName(name); 
		this.setAge(age);
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+this.name+", Age is : "+this.age;
	}

}
