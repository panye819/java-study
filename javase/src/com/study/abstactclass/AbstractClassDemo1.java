package com.study.abstactclass;

/**
 * @author FlyPiG8308
 *�����ࣺ
 *	��һ�����Ǿ���Ĺ��ܳ�Ϊ����Ĺ��ܣ������һ�����а����˳���Ĺ��ܣ��������ͱ����ǳ����ࡣ
 *�ص㣺
 *	1��������ͳ��󷽷���������abstract����
 *	2�������಻һ��Ҫ�г��󷽷������г��󷽷���һ���ǳ�����
 *	3�������಻��ʵ����
 *	4�������������й��췽���ģ����ǲ���ʵ�������������ǶԸ���������ݳ�ʼ��
 *����������ࣺ
 *	1�����������д�����еĳ��󷽷���������������Ǳ�����һ��������
 *	2���������������д�����и����еĳ��󷽷�����ô�������һ�������ࡣ
 *������ĳ�Ա�ص㣺
 *	1����Ա������
 *		�������Ǳ�����Ҳ�����ǳ���
 *	2�����췽����
 *		�У�����������������ʸ������ݵĳ�ʼ��
 *	3����Ա������
 *		�������ǳ���ģ�Ҳ�����Ƿǳ����
 *abstract���ܺ���Щ�ؼ��ֹ��棺
 *	private ��ͻ
 *	final ��ͻ
 *	static ������
 */
abstract class Animal{
	public abstract void eat();
}
abstract class Dog extends Animal{}
abstract class Cat extends Animal{}
class Cat2 extends Animal{
	public  void eat(){
		System.out.println("è����");
	}
}
public class AbstractClassDemo1 {
	public static void main(String[] args) {
		Cat2 c2 = new Cat2();
		c2.eat();
	}

}
