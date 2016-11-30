package com.study.day07_01_variable;

/**
 * 形式参数的问题：
 * 	基本数据类型：
 * 		形式参数的改变不影响实际参数
 * 	引用数据类型：
 * 		形式参数的改变直接影响实际参数
 * 
 * 
 *
 */
class Demo{
	public  int sum(int a,int b){
		return a+b;
	}

}
class Student1{
	public void show(){
		System.out.println("我爱学习");
	}
}
class Student1Demo{
	//如果你看到一个方法的形式参数是一个类类型（引用类型），这里其实需要的是该类的对象
	public void method(Student1 st1){
		st1.show();
	}
}
public class ArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		int result = d.sum(10, 20);
		System.out.println("result is : "+result);
		
		Student1Demo sd = new Student1Demo();
		sd.method(new Student1());
	}

}
