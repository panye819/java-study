package com.study.day24_Thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * ��ʱ����
 * 	������������ָ����ʱ����ĳ�����飬�������ظ�����ĳ������
 * 	����Timer��TimerTask��������
 * 	Timer����ʱ
 *	TimerTask������
 */
class MyTask2 extends TimerTask{
	
	private Timer t;

	public MyTask2(){}
	public MyTask2(Timer t){
		this.t = t;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ԣ�����������ը�ˣ�������");
//		t.cancel();
	}
	
	
}
public class TimerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		//�����ִ�б�ը����
//		t.schedule(new MyTask(), 3000);
//		t.schedule(new MyTask2(t), 3000);
		t.schedule(new MyTask2(), 3000, 2000);
		

	}

}
