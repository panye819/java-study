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
 */
class MyThread1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int x=0;x<10;x++){
			System.out.println(x+"��������Ϸ����������");
		}
	}
}
class MyThread2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int x=0;x<10;x++){
			System.out.println(x+"�����֡���������");
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2();
		//ֱ�ӵ���run������ʵ������ͨ�����ĵ��ã�����ʹ��run��������ʱ�ǵ��̵߳ģ�
		mt1.start();
		mt2.start();
		

	}

}
