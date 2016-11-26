package com.study.day24_Thread;

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
			//����߳�һ��Ҫ��ͬһ������
			try{
			lock.lock();
			if(tickets > 0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�:"+(tickets--)+"��Ʊ");
			}
			}finally{
				lock.unlock();
				}
		}	
	}
	

}
