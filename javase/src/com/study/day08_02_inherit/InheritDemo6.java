package com.study.day08_02_inherit;

/**
 * @author bluebell325
 * 
 *��������еķ����븸���еķ��������ظ���
 *		ͨ��������÷�����
 *			1���Ȳ������࣬����������о�����
 *			2�����������û�У���ȥ�����в��ң�����о�ʹ��
 *			3�������û�оͱ���
 */
class Demo6Father {
	public void show(){
		System.out.println("show Demo6Father");
	}
}
class Demo6Son extends Demo6Father{
	public void method(){
		System.out.println("method Demo6Son");
		
		
	}
	public void show(){
		System.out.println("show Demo6Son");
	}
}
public class InheritDemo6 {
	public static void main(String[] args) {
		Demo6Son d6 = new Demo6Son();
		d6.show();
		d6.method();
//		d6.sit();
	}

}
