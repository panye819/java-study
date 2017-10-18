package lesson08_keyword_static;
/*
 * 	static关键字
 * 	以下程序存在以下问题：
 * 		1、city属性表示的信息都是一样的，所以对于各个对象来说，内容重复了
 * 		2、如果现在需要将A成更名为B城，而且此类已经产生了500个对象，那么会修改500次。
 * 	最好的解决方法，是将city属性设置为公共属性
 * 		如果想将一个属性设置成公共属性，则就需要使用static关键字进行声明
 * 	static除了可以声明属性之外，还可以定义方法，使用static定义的方法可以由类名称直接调用
 * 	在使用静态方法时，需要注意以下几点：
 * 		1、static的方法只能调用static的属性或方法，不能调用非static的属性或方法。
 * 			之所以有这个现实是因为：
 * 				a、静态属性和方法可以在没有实例化对象的时候调用。
 * 				b、而类中的普通方法和普通属性，肯定只有在对象实例化之后才有可能调用
 *  主方法上也存在static关键字，那么主方法的含义是什么？
 *  	public static void main(String args[])
 *  		public：表示最大的权限，所有人都可以访问
 *  		static：因为执行的时候是类名称，所以表示可以由类名称直接调用
 *  		void：因为主方法是一切的起点，所以表示没有返回值
 *  		main：系统内建的方法名称
 *  		String args[]：表示字符串数组，用于接收参数
 * */
class Person{
	private String name;
	private int age;
	static String city = "Houston";
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getInfo() {
		return "姓名： "+this.name+", 年龄： "+this.age+", 城市： "+city;
	}
}
public class StaticDemo01 {
	public static void main(String[] args) {
		Person per1 = new Person("Harden",29);
		Person per2 = new Person("Harden",29);
		Person per3 = new Person("Harden",29);
		System.out.println("----信息修改之前");
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
		System.out.println("----信息修改之后");
//		per1.city = "Nanjing";
		Person.city = "Nanjing";
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
	}
}
