package com.study.day24_01_Pattern;

/**
 * �򵥹���ģʽ�ֳ�Ϊ��̬��������ģʽ��������һ������Ĺ����࣬���𴴽�һЩ���ʵ����
 * 	�ŵ㣺 
 * 		�ͻ��˲��ٸ������Ĵ������Ӷ���ȷ�˸������ְ��
 * 	ȱ�㣺
 *		�����̬�����ฺ�����ж���Ĵ�����������µĶ������ӣ�����ĳЩ����Ĵ�����ʽ��ͬ������Ҫ��ͣ���޸Ĺ����࣬�����ں��ڵ�ά���� 
 *
 */
public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		
		d1.eat();
		c1.eat();
		System.out.println("-------------");
		
		Animal d2 = AnimalFactory.createAnimal("dog");
		Animal c2 = AnimalFactory.createAnimal("cat");
		d2.eat();
		c2.eat();
//		Pig p1 = AnimalFactory.createPig();
		Animal a3 = AnimalFactory.createAnimal("pig");
		if(a3 != null){
			a3.eat();
		}else{
			System.out.println("��ʱû�����ַ���");
		}
	}

}
