package com.study.day23_Thread;

/**
 * ��ӰԺ����ӳһ����Ƭ������100��Ʊ����������ͬʱ��Ʊ
 *
 */
public class SellTicket implements Runnable{
	private int tickets = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//����߳�һ��Ҫ��ͬһ������
			synchronized("��"){
			if(tickets > 0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�:"+(tickets--)+"��Ʊ");
			}
			}
		}	
	}
	

}
