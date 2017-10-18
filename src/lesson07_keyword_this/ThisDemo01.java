package lesson07_keyword_this;
/*
 * this在Java中表示出以下的概念：
 * 	调用类中的属性：this.属性
 * 	调用类中的方法：this.方法()
 * 	调用类中的构造：this()
 * 	表示当前的对象：this
 * 
 * 	所有使用this调用构造方法的时候所有代码必须放在构造方法的首行
 * 	在使用this调用构造方法的时候，至少有一个构造方法是没有使用this()调用的。而此构造方法将作为
 * 	调用类中方法的对象，称为当前对象。
 * */
class Person{
	private String name;
	private int age;
	public Person() {
		System.out.println("----A new object is create.....----");
	}
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
	public Person(String name) {
		this();//调用无参构造
		this.setName(name);
	}
	public Person(String name,int age) {
		this();//调用无参构造
		this.setName(name);
		this.setAge(age);
	}
}

public class ThisDemo01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person("John",30);
		System.out.println(per.getName()+"--->"+per.getAge());
		
	}

}
