package com.study.day07_01_variable;
/*
 * ��Ա�����;ֲ�����������
 * A�������е�λ�ò�ͬ
 * 		��Ա�����������з�����
 * 		�ֲ��������ڷ��������л��߷��������ϡ�
 * B�����ڴ��е�λ�ò�ͬ
 * 		��Ա�������ڶ��ڴ�
 * 		�ֲ���������ջ�ڴ�
 * C���������ڲ�ͬ��
 * 		��Ա���������Ŷ���Ĵ��������ڣ����Ŷ������ʧ����ʧ
 * 		�ֲ����������ŷ����ĵ��ö����ڣ����ŷ����ĵ�����϶���ʧ��
 * D����ʼ��ֵ��ͬ��
 * 		��Ա��������Ĭ�ϳ�ʼ��ֵ
 * 		�ֲ�������û��Ĭ�ϳ�ʼ��ֵ�����붨�壬��ֵ����ʹ�á�
 * ע������:
 * 		�ֲ��������ƿ��Ժͳ�Ա����һ�����ڷ�����ʹ�õ�ʱ�򣬲��õ��Ǿͽ�ԭ��
 */
class Variable{
	int num = 10;//��Ա����
	public void show(){
		int num1  = 20;//�ֲ�����
		System.out.println("num1 in show() is: "+num1);
//		int num = 100;
		System.out.println("num in show() is: "+num);
	}
}
public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable v = new Variable();
		
		System.out.println("num in variable is :"+v.num);
		v.show();
	}

}
