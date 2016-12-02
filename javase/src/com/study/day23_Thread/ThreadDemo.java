package com.study.day23_Thread;

/**
 *���̺��̣߳�
 *	���̣�
 *		�������еĳ�����ϵͳ������Դ����͵��õĶ�����λ
 *	�̣߳�
 *		�ǽ����еĵ���˳�����������һ��ִ��·��
 *		һ���������ֻ��һ��ִ��·�������Ϊ���̳߳���
 *		һ����������ж��ִ��·�������Ϊ���̳߳���
 *
 *	���кͲ�����
 *		���У����߼���ͬʱ������ָ��һ��ʱ�����ͬʱ���ж������
 *		��������������ͬʱ������ָ��һ��ʱ�����ͬʱ���ж������
 *	˼���⣺
 *		JVM����������ǵ��̻߳��Ƕ��̵߳ģ�
 *		���̵߳ģ���Ϊ����������ҲҪ����������������׳����ڴ����
 *		����JVM�������������̣߳�һ�����̣߳�һ���������ս���
 *	���߳�ʵ�ַ�ʽ:
 *		1���̳�Thread��
 *			����:
 *				A���Զ���MyThread��̳�Thread��
 *				B��MyThread��������дrun����
 *					��run������������Щ��Ҫ�������̵߳Ĵ���
 *				C����������
 *				D�������߳�
 *	
 *	�߳����ȼ�Ĭ��Ϊ5�����÷�ΧΪ1��10�����ȼ��߽�����ʾ�̻߳�ȡ��CPUʱ��Ƭ�ļ��ʸߣ�����Ҫ�ڴ����Ƚ϶������»�������ʱ��Ƚϳ����ܿ���Ч����
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
		//ֱ�ӵ���run������ʵ������ͨ�����ĵ��ã�����ʹ��run��������ʱ�ǵ��̵߳ģ�
		mt1.start();
		mt2.start();
		mt3.start();
		
//		MyThread1.sleep(5000);
		System.out.println(Thread.currentThread().getName());

	}

}
