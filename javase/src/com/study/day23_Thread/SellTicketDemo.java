package com.study.day23_Thread;

/**
 * ��ӰԺ����ӳһ����Ƭ������100��Ʊ����������ͬʱ��Ʊ
 *	ͨ�������ӳٺ�����˶������⣺
 *		1����ͬ��Ʊ���˶��
 *		2�������˸���Ʊ
 *	����ж��Ƿ�����̰߳�ȫ���⣺
 *		1���Ƿ���̻߳���
 *		2���Ƿ��й�������
 *		3���Ƿ��ж�����������������
 *	��ν���̰߳�ȫ���⣺
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
