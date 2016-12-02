package com.study.day23_Thread;

/**
 * 电影院在上映一部大片，共有100张票，三个窗口同时售票
 *
 */
public class SaleTicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SaleTicket st1 = new SaleTicket();
		SaleTicket st2 = new SaleTicket();
		SaleTicket st3 = new SaleTicket();
		
		st1.setName("窗口一");
		st2.setName("窗口二");
		st3.setName("窗口三");
		
		
		st1.start();
		st2.start();
		st3.start();
		
		
	}

}
