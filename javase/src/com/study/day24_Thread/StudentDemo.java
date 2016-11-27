package com.study.day24_Thread;

/**
 * ���̼�ͨ������
 *	
 *	������
 *		1����Դ�ࣺStudent
 *		2������ѧ�����ݣ�SetThread�������ߣ�
 *		3����ȡѧ�����ݣ�GetThread�������ߣ�
 *		4�������ࣺStudentDemo
 *
 *	�̰߳�ȫ���⣺
 *		����취������
 *		ע�����
 *			1�����в�ͬ�Ľ��̶�Ҫ����
 *			2�����в�ͬ�Ľ��̼ӵ�Ҫ��ͬһ����
 *	�̵߳ȴ��ͻ��ѻ���
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
