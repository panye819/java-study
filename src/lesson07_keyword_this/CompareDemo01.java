package lesson07_keyword_this;
/*
 *	思考：
 *	一个对象在类的外部能不能直接访问类中的私有成员呢？
 *	如果现在一个对象在类的内部呢？那能否访问私有成员呢？
 *
 *	以下用法的唯一用处，只在对象的比较上。
 * */
class Person2{
	private String name;
	private int age;
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void fun(Person2 temp) {
		temp.name = "李四";
		temp.age = 33;
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
}

public class CompareDemo01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 per = new Person2("张三",30);
		per.fun(per);
		System.out.println(per.getName()+"--->"+per.getAge());
	}

}
