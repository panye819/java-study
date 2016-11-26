package com.study.day23_Thread;

/**
 *进程和线程：
 *	进程：
 *		正在运行的程序，是系统进行资源分配和调用的独立单位
 *	线程：
 *		是进程中的单个顺序控制流，是一条执行路径
 *		一个进程如果只有一个执行路劲，则称为单线程程序
 *		一个进程如果有多个执行路劲，则称为多线程程序
 *
 *	并行和并发：
 *		并行：是逻辑上同时发生，指在一个时间段内同时运行多个程序
 *		并发：是物理上同时发生，指在一个时间点内同时运行多个程序
 *	思考题：
 *		JVM虚拟机启动是单线程还是多线程的？
 *		多线程的，因为垃圾回收器也要先启动，否则很容易出现内存溢出
 *		所以JVM至少启动二个线程，一个主线程，一个垃圾回收进程
 *	多线程实现方式:
 *		1、继承Thread类
 *			步骤:
 *				A：自定义MyThread类继承Thread类
 *				B：MyThread类里面重写run方法
 *					用run方法来包含那些需要启动多线程的代码
 *				C：创建对象
 *				D：启动线程
 *	
 *	线程优先级默认为5，设置范围为1～10，优先级高仅仅表示线程获取的CPU时间片的几率高，但是要在次数比较多的情况下或者运行时间比较长才能看出效果。
 */

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2();
		MyThread3 mt3 = new MyThread3();
		
		mt1.setName("Game_Thread");
		mt2.setName("Music_Thread");
		mt3.setName("Doc_Thread");
		
		mt1.setPriority(10);
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		System.out.println(mt3.getPriority());
		//直接调用run方法其实就是普通方法的调用，所以使用run方法调用时是单线程的，
		mt1.start();
		mt2.start();
		mt3.start();
		
//		MyThread1.sleep(5000);
		System.out.println(Thread.currentThread().getName());

	}

}
