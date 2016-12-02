package com.study.day27_reflect;

/**
 * 类的加载
 * 	当程序要使用某个类时，如果类还未被加载到内存中，那么系统会通过加载，连接，初始化三个步骤，来实现对类的初始化。
 * 		加载：
 * 			指将class文件读入内存，并为之创建一个class对象
 * 			任何类被使用时，系统都会创建一个class对象。
 * 		连接：
 * 			验证：是否有正确的内部结构，并和其他类协调一致
 * 			准备：负责为类的静态成员分配内存，并设置默认初始化值。
 * 			解析：将类的二进制数据中的符号引用替换为直接引用
 * 		初始化：
 * 			就是以前讨论过的类的初始化步骤。
 * 			类的初始化时机：
 * 				1、创建类的实例
 * 				2、方法中的静态变量或者为静态变量赋值
 * 				3、调用类的静态方法
 * 				4、使用反射方式来强制创建某个接口或类对应的java.lang.Class对象
 * 				5、初始化某个类的子类。
 * 				6、直接使用java.exe来运行某个主类
 * 		类加载器：
 * 			负责将.class文件加载到内存中，并为之生成对应的class对象，了解这个机制可以让我们更好的理解程序的运行
 * 			组成：
 *  			1、Bootstrap ClassLoader 根类加载器
 *  				也被称为引导类加载器，负责Java核心类的加载
 *  			2、Extension ClassLoader 扩展类加载器
 *  				负责JRE的扩展目录中jar包的加载
 *  			3、System ClassLoader 系统类加载器
 *					负责在JVM启动时，加载来自Java命令的class文件，以及classpath环境变量所指定的jar包和类路径。
 *		反射：
 *			Java反射机制实在运行状态中，对于任意一个类，都能知道这个类的所有属性和方法，对于任意一个对象，都能调用它的任意一个方法。
 *			这种动态获取的信息以及动态调用对象的方法的功能成为Java语言的反射机制。
 *			就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法。
 *		获取class文件对象的方式：	
 *			1、Object类的getClass()方法
 *			2、数据类型的静态属性class
 *			3、Class类中的静态方法
 *				public static Class forName(String className)
 *				注意：这里面的className一定要带上包名，要写全路径，不然会报错。
 */
public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//获取class文件对象的方式
		//方式一：
		Person p = new Person();
		Class c = p.getClass();
		
		Person p2 = new Person();
		Class c2 = p2.getClass();
		System.out.println(p==p2);
		System.out.println(c==c2);
		//方式二
		Class c3 = Person.class;
		System.out.println(c == c3);
		//方式三
		Class c4 = Class.forName("com.study.day27_reflect.Person");
		System.out.println(c == c4);
		
	}

}
