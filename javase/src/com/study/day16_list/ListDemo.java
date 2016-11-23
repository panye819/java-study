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
 * 集合的嵌套遍历
 * 	
 *
 */
public abstract class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <ArrayList<Student>>bigArrayList = new ArrayList<ArrayList<Student>>();
//		arr1.add("")
		
		
		//创建第一个班级的集合
		ArrayList <Student>arr2 = new ArrayList<Student>();
		Student s1 = new Student("唐僧",30);
		Student s2 = new Student("孙悟空",29);
		Student s3 = new Student("猪八戒",28);
		Student s4 = new Student("沙僧",27);
		Student s5 = new Student("白龙马",26);
		//将学生加入班级
		arr2.add(s1);
		arr2.add(s2);
		arr2.add(s3);
		arr2.add(s4);
		arr2.add(s5);
		
//		System.out.println("arr2 is :"+arr2.get(index));
		//
		bigArrayList.add(arr2);
		
	
		//创建第二个班级的集合
		ArrayList <Student>arr3 = new ArrayList<Student>();
		Student s11 = new Student("诸葛亮",30);
		Student s12 = new Student("周瑜",29);
		Student s13 = new Student("司马懿",28);

		//将学生加入班级
		arr3.add(s11);
		arr3.add(s12);
		arr3.add(s13);

		bigArrayList.add(arr3);
		
		

		//创建第三个班级的集合
		ArrayList <Student>arr4 = new ArrayList<Student>();
		Student s21 = new Student("宋江",30);
		Student s22 = new Student("吴用",29);
		Student s23 = new Student("高俅",28);
		Student s24 = new Student("花荣",28);

		//将学生加入班级
		arr4.add(s21);
		arr4.add(s22);
		arr4.add(s23);
		
		bigArrayList.add(arr4);
		
		//遍历集合
		for(ArrayList<Student> a :  bigArrayList){
//			System.out.println(a);
			for(Student s:a){
				System.out.println("name is : "+s.getName()+"---"+"age is : "+s.getAge());
			}
		}
	}

}
