package com.study.day07_01_variable;

/**
 * ��ʽ���������⣺
 * 	�����������ͣ�
 * 		��ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 * 	�����������ͣ�
 * 		��ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
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
		System.out.println("�Ұ�ѧϰ");
	}
}
class Student1Demo{
	//����㿴��һ����������ʽ������һ�������ͣ��������ͣ���������ʵ��Ҫ���Ǹ���Ķ���
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
