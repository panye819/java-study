package com.study.day23_Thread;

/**
 * 电影院在上映一部大片，共有100张票，三个窗口同时售票
 *
 */
public class SellTicket implements Runnable{
	//为了让对象共享这一百张票，应该把
	private int ticket = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub

		
		while(true){
			synchronized("锁"){			
				if(ticket>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"张票");
//				ticket--;

				}
			}}

		}
	}

}
