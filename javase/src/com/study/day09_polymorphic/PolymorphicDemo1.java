package com.study.day09_polymorphic;

/**
 * ��̬��
 * 	ͬһ�������ڲ�ͬʱ�̱��ֳ����Ĳ�ͬ��̬��
 * 	��̬��ǰ���ʵ��
 * 		1���м̳й�ϵ
 * 		2���з�������д
 * 			��ʵû��Ҳ�ǿ��Եģ�����û�������û������
 * 		3���и�������ָ���������
 * 			���� f = new ���ࣻ
 *	��̬�г�Ա�����ص㣺
 *		1����Ա������
 *			���뿴��ߣ����п����
 *		2�����췽��
 *			������������ʱ�򣬷��ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ��
 *		3����Ա����
 *			���뿴��ߣ����п��ұ�
 *		4����̬����
 *			���뿴��ߣ����п���ߣ���̬������أ��㲻����д�����ʻ�����ߣ�
 */
class Fu{
	public int num = 100;
	public Fu(){
		System.out.println("Fu���췽��");
	}
	public void show(){
		System.out.println("show Fu");
	}
	public static void method(){
		System.out.println("method Fu");
	}
}
class Zi extends Fu{
	public int num = 1000;
	public int num2 = 200;
	public void show(){
		System.out.println("show Zi");
	}
//	public void method(){
//		System.out.println("method Zi");
//	}
	public static void method(){
		System.out.println("method Zi");
	}
}

public class PolymorphicDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fu f = new Zi();
		f.show();
		f.method();
		System.out.println(f.num);
//		System.out.println(f.num2);

		
	}

}
