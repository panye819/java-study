package com.study.day24_02_Pattern;

/**
 *��������ģʽ������
 *	��������ģʽ�У���ȡ�˹����ฺ���崴������Ľӿڣ��������Ĵ��������м̳г��󹤳��ľ�����ʵ��
 *	�ŵ㣺
 *		�ͻ��˲��ٸ���������Ĵ������Ӷ���ȷ�˸������ְ��������µĶ������ӣ�ֻ��Ҫ����һ���������;���Ĺ����༴��
 *		��Ӱ�����еĴ��룬����ά�����ף���ǿ��ϵͳ����չ�ԡ�
 *	ȱ�㣺
 *		��Ҫ��д����Ĵ��룬�����˹�������
 */
public class AnimalDemo2 {
	
	public static void main(String[] args) {
		//��Ҫһֻ��
		Factory f = new DogFactory();
		Animal a4 = f.createAnimal();
		a4.eat();
		System.out.println("-----------");
		//��Ҫһֻè
		Factory f1 = new CatFactory();
		Animal a5 = f1.createAnimal();
		a5.eat();
		System.out.println("-----------");
		//��Ҫһֻ��
		Factory f2 = new PigFactory();
		Animal a6 = f2.createAnimal();
		a6.eat();
		}
}

