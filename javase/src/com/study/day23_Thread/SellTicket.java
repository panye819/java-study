package com.study.day23_Thread;

/**
 * ��ӰԺ����ӳһ����Ƭ������100��Ʊ����������ͬʱ��Ʊ
 *
 */
public class SellTicket implements Runnable{
	//Ϊ���ö�������һ����Ʊ��Ӧ�ð�
	private int ticket = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub

		
		while(true){
			synchronized("��"){			
				if(ticket>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+(ticket--)+"��Ʊ");
//				ticket--;

				}
			}}

		}
	}

}
