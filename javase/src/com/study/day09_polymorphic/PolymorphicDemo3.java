package com.study.day09_polymorphic;

/**
 * @author bluebell325
 *��̬�ı׶�
 *	����ʹ���������еķ���
 *		����취��
 *			1����������Ķ�����÷������ɡ������ԣ����Ǻܶ�ʱ�򲻺������ң�̫ռ�ڴ��ˡ���
 *			2���Ѹ��������ǿ��ת��Ϊ��������á�������ת�ͣ�
 *				�����ת�͵����⣺
 *					����ת�ͣ�DemoFu df = new DemoZi();
 *					����ת�ͣ�DemoZi dz = (DemoZi) df;//Ҫ���df�������ܹ�ת��ΪDemoZi�ġ�
 */
class DemoFu{
	public void show(){
		System.out.println("show DemoFu");
	}
}
class DemoZi extends DemoFu{
	public void show(){
		System.out.println("show DemoZi");
	}
	public void method(){
		System.out.println("method DemoZi");
	}
}
public class PolymorphicDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoFu df = new DemoZi();
		df.show();
//		df.method();
		
		DemoZi dz =(DemoZi)df;
		dz.show();
		dz.method();
		
		
	}

}
