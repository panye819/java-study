package com.study.method_rewrite;

/**
 * 
 *���������า�ǵ������еķ�������ʱJava�ṩ��һ���ؼ���final��
 *	final���������࣬���಻�ܱ��̳�
 *	final�������η������÷������ܱ���д
 *	final�������α������ñ������ܱ����¸�ֵ����Ϊ���������ʵ�ǳ���
 *		final���ξֲ�������
 *			1���ֲ�����Ϊ��������ʱ���ñ������ܱ����¸�ֵ
 *			2���ֲ�����Ϊ��������ʱ���ñ�����ֵַ���ܱ��ı䣬���ö���Ķ��ڴ��ֵ�ǿ��Ըı�ġ�
 *	final���α����ĳ�ʼ��ʱ����
 *		1����final���εı���ֻ�ܸ�ֵһ��
 *		2���ڹ��췽�����ǰ�����Ǿ�̬�ĳ�����
 *
 *
 */
class Student{
	int age = 10;
	public final void show(){
		System.out.println("�����Ǿ�����Դ���κ��˲����޸ģ�");
	}
	
}
//class Zi extends Fu{
//
//	public void show1() {
//		// TODO Auto-generated method stub
//		System.out.println("����һ������������");
//	}
//	
//}

public class FinalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println("age is : "+s.age);
		s.age = 100;
		System.out.println("age is : "+s.age);
		System.out.println("------------------------");
		Student ss = new Student();
		System.out.println("age is : "+ss.age);
		ss.age = 100;
		System.out.println("age is : "+ss.age);
	
		System.out.println("------------------------");
		final Student ss1 = new Student();
		System.out.println("age is : "+ss1.age);
		ss1.age = 300;
		System.out.println("age is : "+ss1.age);
		//2���ֲ�����Ϊ��������ʱ���ñ�����ֵַ���ܱ��ı䡣
//		ss1 = new Student();//����

		
	}

}
