package com.study.day23_Thread;

/**
 * 电影院在上映一部大片，共有100张票，三个窗口同时售票
 *	通过加入延迟后出现了二个问题：
 *		1、相同的票卖了多次
 *		2、出现了负数票
 *	如何判断是否会有线程安全问题：
 *		1、是否多线程环境
 *		2、是否有共享数据
 *		3、是否有多条语句操作共享数据
 *	如何解决线程安全问题：
 *		
 *
 *	同步的特点：
 *		1、多个线程
 *		2、多个线程必须使用的是同一个锁
 *	同步的好处：
 *		1、解决了线程安全问题
 *	同步的弊端：
 *		1、当线程相当多的时候，因为每个线程都会去判断资源上的锁，这是很耗费资源的，无形中会降低程序的执行效率
 *	同步代码块的对象，可以是任意对象
 *	同步方法的对象是this
 *	静态方法的对象是其class文件
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
