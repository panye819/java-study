package com.study.day08_02_inherit;

/**
 * @author bluebell325
 * 
 *һ����ľ�̬����顢�������顢���췽����ִ������
 *		��̬�����----��������----���췽��
 *��̬�������������ļ��ض����أ�������ִ��
 *�����ʼ��֮ǰ���Ƚ��и���ĳ�ʼ�����ֲ��ʼ����
 *		��Ȼ���๹�췽����Ĭ����super()��䣬����ʼ����ʱ���ǰ����Ǹ�˳����е�
 *		���ǰ��շֲ��ʼ�����еģ���������ʾҪ�ȳ�ʼ���������ݣ�Ȼ���ڳ�ʼ����������
 *���Խ��Ϊ��
 *��̬�����Fu1
 *��̬�����Zi1
 *��������Fu1
 *���췽��Fu1
 *��������Zi1
 *���췽��Zi1
 */
class Fu1{
	static {
		System.out.println("��̬�����Fu1");
	}
	{
		System.out.println("��������Fu1");
	}
	public Fu1(){
		System.out.println("���췽��Fu1");
	}
}
class Zi1 extends Fu1{
	static {
		System.out.println("��̬�����Zi1");
	}
	{
		System.out.println("��������Zi1");
	}
	public Zi1(){
		System.out.println("���췽��Zi1");
	}
	public void show(){
	}
}
public class InheritDemo5 {
	public static void main(String[] args) {
		Zi1 z = new Zi1();
	}

}
