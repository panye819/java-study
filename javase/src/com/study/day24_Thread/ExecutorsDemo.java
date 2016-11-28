package com.study.day24_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ���ڳ�������һ�����̳߳ɱ��ǱȽϸߵģ���Ϊ��Ҫȥ�Ͳ���ϵͳ����������ʹ���̳߳�����Ժܺõ�������ܡ�
 * �����ǵ�������Ҫ��������������ʱ��̵ܶ��߳�ʱ����Ӧ�ÿ����̳߳ء�
 * 	1���̳߳����ÿһ���̴߳�������󲢲������������ǻص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ��
 * 	2��JDK5֮ǰ��Ҫ�ֶ�ʵ���̳߳أ�JDK5֮��Java����֧���̳߳�
 *
 *	ʵ�ַ�����
 *		1������һ���̳߳ض��󣬿���Ҫ������������
 *		2��ִ��Runable����Callable���������̡߳�
 *		3���������·���
 *			 Future<?> submit(Runnable task) �ύһ�� Runnable ��������ִ�У�������һ����ʾ������� Future�� 
 *			<T> Future<T>  submit(Callable<T> task) �ύһ������ֵ����������ִ�У�����һ����ʾ�����δ������� Future�� 
 *		4�������Ҫ�����̳߳صĻ�������shutdown����
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
//		MyRunnable mr = new MyRunnable();
		
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
//		pool.submit(new MyRunnable());//��Ȼ���ᱨ��������������Ϊ����ֻ������2��
		//�ر��̳߳�
		pool.shutdown();
	}
}
