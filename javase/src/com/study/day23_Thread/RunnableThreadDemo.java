package com.study.day23_Thread;

import java.util.Date;

/**
 * 线程的第二种实现方式：实现Runnable接口
 * 	步骤：
 * 		1、自定义Runnable类实现Runnable接口
 * 		2、重写run方法
 * 		3、创建Runnable对象
 * 		4、创建Thread对象，将第三步的对象作为构造参数传递
 * 	优点：
 * 		实现接口方式的好处
 * 			可以避免由于单继承带来的局限性
 * 			适合多个相同程序的代码去处理同一个资源的情况，把线程同程序的代码，数据有效分离，较好的体现了面向对象的设计思想。
 *
 */
class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x=0;x<20;x++){
			System.out.println(Thread.currentThread().getName()+":"+x+" 我在玩游戏。。。。。日期是："+new Date());
		}
	}
	
	
}
public class RunnableThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable my = new MyRunnable();
		
		Thread t1  = new Thread(my, "单机游戏");
		Thread t2  = new Thread(my, "网络游戏");
		t1.start();
		t2.start();
	}

}
