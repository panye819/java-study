package com.study.day24_02_Pattern;

/**
 *	�������ģʽ��
 *		�������ģʽ����Ҫ��֤�����ڴ���ֻ��һ�����󣬸�ʵ�������Զ��������������ṩ��
 *	�ŵ㣺
 *		���ڴ���ֻ����һ�������������Խ�Լϵͳ��Դ������һЩ��ҪƵ�����������ٵĶ��󣬵���ģʽ�������ϵͳ���ܡ�
 *	ȱ�㣺
 *		û�г���㣬�����չ����
 *		ְ����أ���һ���̶���Υ���˵�һԭ��
 *	��α�֤�����ڴ���ֻ��һ�������أ�
 *		1�����췽��˽��
 *		2���ڳ�Աλ���Լ�����һ������
 *		3��ͨ��һ�������������ʡ�
 *	
 */
public class SingleModelDemo {
	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		Student s2 = new Student();
//		System.out.println(s1==s2);
//		Student.s = null;
		
		Student s3 = Student.getStudent();
		Student s4 = Student.getStudent();
		System.out.println(s3==s4);
		System.out.println(s3);
		System.out.println(s4);
		
		
	}

}
