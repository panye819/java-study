package lesson07_keyword_this;
/*
 *	思考：
 *		如何比较两个对象是否相同
 * */
class Person3{
	private String name;
	private int age;
	public Person3(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public boolean compare(Person3 per) {
		if(this==per) {
			return true;
		}
		if(this.name.equals(per.name)&& this.age==per.age) {
			return true;
		}else {
			return false;
		}
	}
	public void fun(Person3 temp) {
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

public class CompareDemo02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 per1 = new Person3("张三",30);
		Person3 per2 = new Person3("张三",30);
		if(per1.compare(per2)){ 
		System.out.println("是同一个对象......");
		}
		System.out.println("----我是分隔线----");
		if(per1.compare(per1)){ 
			System.out.println("是同一个对象......");
		}
	}
}