package com.study.day23_Thread;

import java.util.Date;

/**
 * �̵߳ĵڶ���ʵ�ַ�ʽ��ʵ��Runnable�ӿ�
 * 	���裺
 * 		1���Զ���Runnable��ʵ��Runnable�ӿ�
 * 		2����дrun����
 * 		3������Runnable����
 * 		4������Thread���󣬽��������Ķ�����Ϊ�����������
 * 	�ŵ㣺
 * 		ʵ�ֽӿڷ�ʽ�ĺô�
 * 			���Ա������ڵ��̳д����ľ�����
 * 			�ʺ϶����ͬ����Ĵ���ȥ����ͬһ����Դ����������߳�ͬ����Ĵ��룬������Ч���룬�Ϻõ������������������˼�롣
 *
 */
class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x=0;x<20;x++){
			System.out.println(Thread.currentThread().getName()+":"+x+" ��������Ϸ���������������ǣ�"+new Date());
		}
	}
	
	
}
public class RunnableThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable my = new MyRunnable();
		
		Thread t1  = new Thread(my, "������Ϸ");
		Thread t2  = new Thread(my, "������Ϸ");
		t1.start();
		t2.start();
	}

}
