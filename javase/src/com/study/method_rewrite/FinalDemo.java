package com.study.method_rewrite;

/**
 * 
 *���������า�ǵ������еķ�������ʱJava�ṩ��һ���ؼ���final��
 *	final���������࣬���಻�ܱ��̳�
 *	final�������η������÷������ܱ���д
 *	final�������α������ñ������ܱ����¸�ֵ����Ϊ���������ʵ�ǳ���
 *
 *
 */
class Fu{
	public final void show(){
		System.out.println("�����Ǿ�����Դ���κ��˲����޸ģ�");
	}
	
}
class Zi extends Fu{

	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("����һ������������");
	}
	
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi z = new Zi();
		z.show();
		z.show1();

	}

}
