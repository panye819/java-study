package lesson06_String;
/*
 * 一个字符串是使用""包括起来的，一个字符串常量实际上本身就属于String的一个匿名对象
 * String 的两种实例化方式的区别：
 * 		直接赋值产生一个内存空间
 * 		通过构造方法会产生两个内容一模一样的内存空间，其中一个没有引用，是系统垃圾
 * 所以推荐用直接赋值的方式创建字符串对象，不要使用关键字new来调用构造方法来创建字符串对象
 * 使用直接赋值的方式可以减少堆内存的开销
 * 
 * 字符串的内容一旦声明之后就无法更改，改变的是堆内存的指向空间
 * 
 * */
public class String01 {
	public static void main(String[] args) {
		String str1 = "Hello";//使用直接赋值的方式完成
		String str2 = new String("Hello");//通过构造方法完成
		String str3 = str2;//通过构造方法完成
		System.out.println(str1+" "+str2);
		//==是比较字符串的内存地址是否相等
		System.out.println("str1 == str2 --->"+(str1==str2));//false
		System.out.println("str1 == str3 --->"+(str1==str3));//false
		System.out.println("str2 == str3 --->"+(str2==str3));//true
		//equals是比较字符串的内容是否相等
		System.out.println("str1 equals str2 --->"+(str1.equals(str2)));//true
		System.out.println("str1 equals str3 --->"+(str1.equals(str3)));//true
		System.out.println("str2 equals str3 --->"+(str2.equals(str3)));//true
		//验证string类的匿名对象
		System.out.println("Hello equals str1 -->"+"Hello".equals(str1));
		//使用直接赋值的方式可以减少堆内存的开销
		//下面定义的三个字符串内容相同，在堆内存中只有一个内存空间，让这些对象进行引用
		String str4 = "JAVA";
		String str5 = "JAVA";
		String str6 = "JAVA";
		System.out.println("str4 == str5 --->"+(str4==str5));//true
		System.out.println("str4 == str6 --->"+(str4==str6));//true
		System.out.println("str5 == str6 --->"+(str5==str6));//true
	}
}
