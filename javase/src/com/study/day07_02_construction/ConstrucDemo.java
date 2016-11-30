package com.study.day07_02_construction;
/*构造方法：
 * 	1、作用：
 * 		用于对对象的数据进行初始化
 * 	2、格式：
 * 		方法名和类名相同
 * 		没有返回值类型，连void都不能有
 * 		没有返回值
 * 	3、注意事项：
 * 		如果我们没写构造方法，系统会提供一个默认的无参构造方法
 * 		如果我们给出了构造方法，系统将不再提供默认构造方法。
 * 			如果这个时候，我们需要使用无参构造方法，就必须自己给出
 * 			推荐：永远手动自己给出无参构造方法	
 * */
class Student{
	public Student(){
		System.out.println("这是构造方法");
	}
	
}

public class ConstrucDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();//堆内存
		System.out.println(s);
	}

}
