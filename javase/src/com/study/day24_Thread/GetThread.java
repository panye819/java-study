package com.study.day24_Thread;

public class GetThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	private Student s;
	public GetThread(Student s){
		this.s = s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		Student s = new Student();
		System.out.println(s.name+"---"+s.age);
	}

}
