package com.study.day16_list;

import java.util.ArrayList;

class Student{
	String name;
	int age;
	public Student(){}
	public Student(String name,int age){
		this.name = name;
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
/**
 * ���ϵ�Ƕ�ױ���
 * 	
 *
 */
public abstract class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <ArrayList<Student>>bigArrayList = new ArrayList<ArrayList<Student>>();
//		arr1.add("")
		
		
		//������һ���༶�ļ���
		ArrayList <Student>arr2 = new ArrayList<Student>();
		Student s1 = new Student("��ɮ",30);
		Student s2 = new Student("�����",29);
		Student s3 = new Student("��˽�",28);
		Student s4 = new Student("ɳɮ",27);
		Student s5 = new Student("������",26);
		//��ѧ������༶
		arr2.add(s1);
		arr2.add(s2);
		arr2.add(s3);
		arr2.add(s4);
		arr2.add(s5);
		
//		System.out.println("arr2 is :"+arr2.get(index));
		//
		bigArrayList.add(arr2);
		
	
		//�����ڶ����༶�ļ���
		ArrayList <Student>arr3 = new ArrayList<Student>();
		Student s11 = new Student("�����",30);
		Student s12 = new Student("���",29);
		Student s13 = new Student("˾��ܲ",28);

		//��ѧ������༶
		arr3.add(s11);
		arr3.add(s12);
		arr3.add(s13);

		bigArrayList.add(arr3);
		
		

		//�����������༶�ļ���
		ArrayList <Student>arr4 = new ArrayList<Student>();
		Student s21 = new Student("�ν�",30);
		Student s22 = new Student("����",29);
		Student s23 = new Student("��ٴ",28);
		Student s24 = new Student("����",28);

		//��ѧ������༶
		arr4.add(s21);
		arr4.add(s22);
		arr4.add(s23);
		
		bigArrayList.add(arr4);
		
		//��������
		for(ArrayList<Student> a :  bigArrayList){
//			System.out.println(a);
			for(Student s:a){
				System.out.println("name is : "+s.getName()+"---"+"age is : "+s.getAge());
			}
		}
	}

}
