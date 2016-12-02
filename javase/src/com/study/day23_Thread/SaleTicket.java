package com.study.day23_Thread;

/**
 * 电影院在上映一部大片，共有100张票，三个窗口同时售票
 *
 */
public class SaleTicket extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//为了让对象共享这一百张票，应该把
		int ticket = 100;
		
		while(true){
			if(ticket>0){
				System.out.println(getName()+"正在出售第"+(ticket--)+"张票");
//				ticket--;
			}
		}
	}

}
