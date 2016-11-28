package com.study.day24_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 由于程序启动一个新线程成本是比较高的，因为它要去和操作系统做交互，而使用线程池则可以很好的提高性能。
 * 尤其是当程序需要创建大量的生存时间很短的线程时，更应该考虑线程池。
 * 	1、线程池里的每一个线程代码结束后并不会死亡，而是回到线程池中成为空闲状态，等待下一个对象来使用
 * 	2、JDK5之前需要手动实现线程池，JDK5之后，Java内置支持线程池
 *
 *	实现方法：
 *		1、创建一个线程池对象，控制要创建几个对象
 *		2、执行Runable或者Callable对象代表的线程。
 *		3、调用如下方法
 *			 Future<?> submit(Runnable task) 提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。 
 *			<T> Future<T>  submit(Callable<T> task) 提交一个返回值的任务用于执行，返回一个表示任务的未决结果的 Future。 
 *		4、如果需要结束线程池的话，调用shutdown方法
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
//		MyRunnable mr = new MyRunnable();
		
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
//		pool.submit(new MyRunnable());//虽然不会报错，但不会允许，因为上面只定义了2个
		//关闭线程池
		pool.shutdown();
	}
}
