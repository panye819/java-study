package com.study.day24_01_Thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * ��ʱ����
 * 	������������ָ����ʱ����ĳ�����飬�������ظ�����ĳ������
 * 	����Timer��TimerTask��������
 * 	Timer����ʱ
 *	TimerTask������
 */
class MyTask extends TimerTask{
	
	private Timer t;

	public MyTask(){}
	public MyTask(Timer t){
		this.t = t;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ԣ�����������ը�ˣ�������");
		t.cancel();
	}
	
	
}
public class TimerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		//�����ִ�б�ը����
//		t.schedule(new MyTask(), 3000);
		t.schedule(new MyTask(t), 3000);

	}

}
