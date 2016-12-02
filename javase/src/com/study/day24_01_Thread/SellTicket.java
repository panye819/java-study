package com.study.day24_01_Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 */
public class SellTicket implements Runnable{
	private int tickets = 100;
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//多个线程一定要是同一把锁。
			try{
			lock.lock();
			if(tickets > 0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在出售第:"+(tickets--)+"张票");
			}
			}finally{
				lock.unlock();
				}
		}	
	}
	

}
