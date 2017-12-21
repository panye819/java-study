package section85_reflect;
interface info{
	public static final String AUTHOR="PY";
	public String getInfo();
	public String say(String name,String content);
	public void sayHello();
}
public class Person2 implements info{
	public String getInfo() {
		return "Hello World!!";
	}
	public String say(String name, String content) {
		return name+"说了："+content;
	}
	public void sayHello() {
		System.out.println("Hello ---->"+AUTHOR);
	}
	private String name;
	private int age;
 
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
	public Person2() {
		
	}
	
	public Person2(String name) {
		this.setName(name); 
	}
	public Person2(String name,int age) {
		this.setName(name); 
		this.setAge(age);
	}
	
	public String toString() {
		return "Name: "+this.name+", Age is : "+this.age;
	}

}
