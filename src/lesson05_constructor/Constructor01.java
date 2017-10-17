package lesson05_constructor;
/*
 * 观察对象的实例化操作：
 * 	Person per1 = new Person();
 * 实际上上面的“()”就表示调用的是一个方法，这个方法实际上就是构造方法。
 * 	构造方法定义时是有一些要求的：
 * 		构造方法的名称必须与类名相同
 * 		构造方法定义时没有返回值类型的声明
 * 		不能在构造方法中使用return返回一个内容
 * 如果在一个类中没有明确的声明了一个构造方法的话，则会自动生成一个无参的什么都不做的构造方法
 * 
 * 如果在一个类中已经明确的声明了一个构造方法的话，则系统不会再生成无参的什么都不做的构造方法
 * 构造方法一定是在使用关键字的时候才进行调用的，并且一个类中允许存在至少一个构造方法
 * */

class Person{
	String name;
	int age;
	public void tell() {
		System.out.println("This year "+name+" is "+age+" years old!");
	}
}
public class Constructor01 {
	public static void main(String[] args) {
		Person per1 = new Person();
		per1.name = "John";
		per1.age = 30;
		per1.tell();
		
	}
}
