package com.study.day24_Thread;

/**
 *	Ϊ�˸�����ı����μ������ͷ�����JDK5�Ժ��ṩ��һ���µ�������Lock
 *		lock():
 *		unlock():
 *	�������⣺
 *		���������ͬ��Ƕ�ף������׳����������⡣��ָ�������߶��������߳���ִ�еĹ����У���������Դ��������һ�ֻ���ȴ�������
 *
 */
public class SellTicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SellTicket st1 = new SellTicket();
		
		Thread t1 = new Thread(st1, "����һ");
		Thread t2 = new Thread(st1, "���ڶ�");
		Thread t3 = new Thread(st1, "������");
				
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}

}
