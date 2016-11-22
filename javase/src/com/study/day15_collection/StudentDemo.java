package com.study.day15_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �ü��ϴ洢5��ѧ������
 *
 */
class Student {
	private String name;
	private int age;
	public Student(){
		super();
	}
	public Student(String name,int age){
		super();
		this.name = name ;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class StudentDemo {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		//����ѧ������
		Student s1 = new Student("����ϼ",27);
		Student s2 = new Student("������",30);
		Student s3 = new Student("�����",33);
		Student s4 = new Student("��ӯӯ",37);
		Student s5 = new Student("������",47);
		//��ѧ��������ӵ�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		//�Ѽ���ת��������
		Object[] objs = c.toArray();
		for(int x = 0;x<objs.length;x++){
//			System.out.println(objs[x]);
			Student s = (Student)objs[x];
			System.out.println(s.getName()+"----"+s.getAge());
		}
			
	}
	
}
