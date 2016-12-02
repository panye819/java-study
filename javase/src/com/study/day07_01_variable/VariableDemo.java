package com.study.day07_01_variable;
/*
 * 成员变量和局部变量的区别？
 * A：在类中的位置不同
 * 		成员变量：在类中方法外
 * 		局部变量：在方法定义中或者方法声明上。
 * B：在内存中的位置不同
 * 		成员变量：在堆内存
 * 		局部变量：在栈内存
 * C：生命周期不同：
 * 		成员变量：随着对象的创建而存在，随着对象的消失而消失
 * 		局部变量：随着方法的调用而存在，随着方法的调用完毕而消失。
 * D：初始化值不同：
 * 		成员变量：有默认初始化值
 * 		局部变量：没有默认初始化值，必须定义，赋值才能使用。
 * 注意事项:
 * 		局部变量名称可以和成员变量一样，在方法中使用的时候，采用的是就近原则。
 */
class Variable{
	int num = 10;//成员变量
	public void show(){
		int num1  = 20;//局部变量
		System.out.println("num1 in show() is: "+num1);
//		int num = 100;
		System.out.println("num in show() is: "+num);
	}
}
public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable v = new Variable();
		
		System.out.println("num in variable is :"+v.num);
		v.show();
	}

}
