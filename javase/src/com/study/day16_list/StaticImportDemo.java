package com.study.day16_list;

/**
 * ��̬����
 *	����ֱ�ӵ��뵽��������
 *	��ʽ��
 *	import static ����...����....������
 *	ע�����
 *	1�����������Ǿ�̬��
 *	2������ж��ͬ���ľ�̬��������ôҪ��ǰ׺���á�
 */
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;



public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-100));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.max(20, 30));
		System.out.println("-------------");
		
		System.out.println(abs(-100));
		System.out.println(pow(2, 3));
		System.out.println(max(20, 30));
	}

}
