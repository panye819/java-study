package com.study.day23_Thread;

/**
 * ��ӰԺ����ӳһ����Ƭ������100��Ʊ����������ͬʱ��Ʊ
 *
 */
public class SaleTicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SaleTicket st1 = new SaleTicket();
		SaleTicket st2 = new SaleTicket();
		SaleTicket st3 = new SaleTicket();
		
		st1.setName("����һ");
		st2.setName("���ڶ�");
		st3.setName("������");
		
		
		st1.start();
		st2.start();
		st3.start();
		
		
	}

}
