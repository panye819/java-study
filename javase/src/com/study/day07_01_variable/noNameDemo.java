package com.study.day07_01_variable;

/**
 * ��������
 * 		����û�����ֵĶ���
 * ���ó�����
 * 		1�����÷�������������һ�ε�ʱ��
 * 			�������������Ͼ������������Ա���������������
 * 		2��������Ϊ��������
 *
 */
class Student2{
	public void show(){
		System.out.println("�Ұ�ѧϰ");
	}
}
class Student2Demo{
	public void method(Student2 st2){
		st2.show();
	}
}
public class noNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 st2 = new Student2();
		//�����ֵĵ���
		st2.show();
		System.out.println("-----");
		//�����������
		new Student2().show();
		System.out.println("-----");
		//��Ϊʵ�ʲ�������
		Student2Demo s2d = new Student2Demo();
		s2d.method(new Student2());
		System.out.println("-----");
		new Student2Demo().method(st2);
	}

}
