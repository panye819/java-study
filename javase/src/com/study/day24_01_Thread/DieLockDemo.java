package com.study.day24_01_Thread;

/**
 *	�������⣺
 *		���������ͬ��Ƕ�ף������׳����������⡣
 *		������ָ�������߶��������߳���ִ�еĹ����У���������Դ��������һ�ֻ���ȴ�������
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
