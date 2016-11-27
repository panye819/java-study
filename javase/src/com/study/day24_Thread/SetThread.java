package com.study.day24_Thread;

public class SetThread implements Runnable {
	private Student s;
	public SetThread(Student s){
		this.s = s;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		Student s = new Student();
		s.name = "¿¨Èû¶û";
		s.age = 27;
//		System.out.println(s.name+"---"+s.age);
	}

}
