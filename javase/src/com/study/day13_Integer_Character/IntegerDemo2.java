package com.study.day13_Integer_Character;

/**
 *	JDK5�������ԣ�
 *		�Զ�װ�䣺�ѻ�������ת��Ϊ��װ������
 *		�Զ����䣺�Ѱ�װ������ת��Ϊ��������
 *	�����null��װ�䣬�ᱨNullPointerException�쳣
 */
public class IntegerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = 100;
		
		i += 200;
		System.out.println("i: "+i);
		
		//NullPointerException
//		Integer ii = null;
		Integer ii = 100;
		ii += 1000;
		System.out.println("ii : "+ii);
	}

}
