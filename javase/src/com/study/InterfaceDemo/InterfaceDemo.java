package com.study.InterfaceDemo;

/**
 * @author FlyPiG8308
 *�ӿڵ��ص㣺
 *	1���ӿ��ùؼ���interface��ʾ
 *		interface �ӿ��� {}
 *	2����ʵ�ֽӿ���implements��ʾ
 *		class ���� implements �ӿ���{}
 *	3���ӿڲ���ʵ����
 *		���ն�̬�ķ�ʽ��ʵ����
 *	4���ӿڵ����ࣺ
 *		�����ǳ����࣬�������岻��
 *		�����Ǿ����࣬����Ҫ��д�ӿ������еĳ��󷽷������Ƽ�������
 *�ӿڵĳ�Ա�ص�:
 *	��Ա������ֻ���ǳ����������Ǿ�̬��
 *			Ĭ�����η���public static final
 *	���췽�����ӿ�û�й��췽���������е��඼Ĭ�ϼ̳���һ���ࣺobject
 *			
 */
interface Inter{
	public int num = 10;
	public final int num2 = 20;
	
}
class InterImpl implements Inter{
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
//		i.num = 100;
//		i.num2 = 200;
////		System.out.println(i.num);
////		System.out.println(i.num2);
//		
		
	}

}
