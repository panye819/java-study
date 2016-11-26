package com.study.day24_Thread;

/**
 *	为了更清楚的表达如何加锁和释放锁，JDK5以后提供了一个新的所对象Lock
 *		lock():
 *		unlock():
 *	死锁问题：
 *		如果出现了同步嵌套，就容易出现死锁问题。是指二个或者二个以上线程在执行的过程中，因争夺资源而产生的一种互相等待的现象。
 *
 */
public class SellTicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SellTicket st1 = new SellTicket();
		
		Thread t1 = new Thread(st1, "窗口一");
		Thread t2 = new Thread(st1, "窗口二");
		Thread t3 = new Thread(st1, "窗口三");
				
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}

}
