package com.study.day23_Thread;

import java.util.Date;

class MyThread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int x=0;x<10;x++){
			System.out.println(getName()+":"+x+" ��������Ϸ���������������ǣ�"+new Date());
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int x=0;x<10;x++){
			System.out.println(getName()+":"+x+" �����֡��������������ǣ�"+new Date());
			
		}
	}
}
class MyThread3 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int x=0;x<10;x++){
			System.out.println(getName()+":"+x+" ���ĵ�����������,�����ǣ�"+new Date());
		}
		
	}
}
public class MyThread {
	
}
