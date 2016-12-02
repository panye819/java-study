package com.study.day24_02_Pattern;

public class Teacher {
	private Teacher(){}
	private static Teacher t = null;
	
	public static Teacher getTeacher(){
		if(t==null){
			t = new Teacher();
		}
		return t;
	}
}
