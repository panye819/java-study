package com.study.day24_02_Pattern;

/**
 *	����ʽ��
 *		��һ���ؾʹ�������.
 *		�ǲ������������ģʽ
 *	����ʽ��
 *		��Ҫ�����ʱ���ȥ��������
 *		���ܻ������ġ�
 *			1���ӳټ���˼��
 *			2���̰߳�ȫ���⡣
 */
public class Student {
	private Student(){}
	//��̬��Ա����
	//Ϊ�˲�������޸������������Ҫ����Ȩ�޽��п��ƣ���private
	private static Student s = new Student();
	//Ϊ�˱�֤������ֱ�ӷ��ʸ÷�������Ҫ��static����
	public static Student getStudent(){
		return s;
		
	}
}
