package com.study.day23_Thread;

/**
 * ��ӰԺ����ӳһ����Ƭ������100��Ʊ����������ͬʱ��Ʊ
 *
 */
public class SaleTicket extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Ϊ���ö�������һ����Ʊ��Ӧ�ð�
		int ticket = 100;
		
		while(true){
			if(ticket>0){
				System.out.println(getName()+"���ڳ��۵�"+(ticket--)+"��Ʊ");
//				ticket--;
			}
		}
	}

}
