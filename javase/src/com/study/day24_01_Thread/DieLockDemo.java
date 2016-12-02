package com.study.day24_01_Thread;

/**
 *	死锁问题：
 *		如果出现了同步嵌套，就容易出现死锁问题。
 *		死锁是指二个或者二个以上线程在执行的过程中，因争夺资源而产生的一种互相等待的现象。
 * *
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);
		
		dl1.start();
		dl2.start();
		
	}

}
