package com.study.method_rewrite;

/**
 * ������д��
 * 	�����г������븸����������ͬ�ķ�����Ҳ����Ϊ�������ǻ��߷�����д
 * 	�����������ͬ���о͵�����Ӧ�ķ����������������ͬ���͵�������ķ�����
 * ע�����
 * 	1�����෽���е�˽�з������ܱ���д
 * 	2��������д���෽��ʱ������Ȩ�޲��ܸ���
 * 	3�����ྲ̬�������������ͨ����̬����������д��
 *
 */
class Father {
	public Father(){}
	public void sing(){
		System.out.println("Father is singing.....");
	}
}
class Son extends Father{
	public Son(){}
	public void sing(){
		System.out.println("Son is singing.....");
	}
	
}
public class RewriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		s1.sing();

	}

}
