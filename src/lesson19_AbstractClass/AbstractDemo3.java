package lesson19_AbstractClass;
/**
 * 从对象多态性的概念上来看，子类为父类实例化是一个比较容易的操作，因为可以发生自动的向上转型关系
 * 那么调用的方法永远是被子类覆写过的方法
 * */
abstract class Person{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
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
	public void say() {
		System.out.println(this.getContent());
	}
	public abstract String getContent();
}
class Student extends Person{
	private float score;
	public Student(String name,int age,float score) {
		super(name,age);
		this.score = score;
	}
	public String getContent() {
		return 	"学生说 --> 姓名： "+super.getName()+", 年龄是： "+super.getAge()
		+",分数是："+this.score;
	}
}
class Worker extends Person{
	private float salary;
	public Worker(String name,int age,float salary) {
		super(name,age);
		this.salary = salary;
	}
	public String getContent() {
		return "工人说 --> 姓名："+super.getName()+",年龄是： "+super.getAge()
		+",薪水是： "+this.salary;
	}
}
public class AbstractDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Student("Tom",18,99);
		p1.say();
		Person p2 = new Worker("Jerry",39,19000);
		p2.say();
		Student s = new Student("Tom",28,90);
		s.say();
		Worker w = new Worker("Jerry",49,20000);
		w.say();
	}

}
