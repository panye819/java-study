package com.study.day24_Thread;

/**
 * 进程间通信问题
 *	
 *	分析：
 *		1、资源类：Student
 *		2、设置学生数据：SetThread（生产者）
 *		3、获取学生数据：GetThread（消费者）
 *		4、测试类：StudentDemo
 *
 *	线程安全问题：
 *		解决办法：枷锁
 *		注意事项：
 *			1、所有不同的进程都要枷锁
 *			2、所有不同的进程加的要是同一把锁
 *	线程等待和唤醒机制
 */

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		t1.start();
		t2.start();
	}
}
