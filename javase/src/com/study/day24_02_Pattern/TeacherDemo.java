package com.study.day24_02_Pattern;

public class TeacherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1==t2);
		System.out.println(t1);
		System.out.println(t2);
	}

}
