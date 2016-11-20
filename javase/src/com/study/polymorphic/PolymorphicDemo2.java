package com.study.polymorphic;

/**
 * ��̬�ĺô�
 * 	1������˴����ά���ԣ��̳б�֤��
 * 	2������˴������չ�ԣ���̬��֤��
 * ��̬�ı׶ˣ�
 * 	1������ʹ����������й���
 * 		
 */
class Animal{
	public Animal(){}
	public void eat(){
		System.out.println("eat.....");
	}
	public void sleep(){
		System.out.println("sleep.....");
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("Dog eat meat.....");
	}
	public void sleep(){
		System.out.println("Dog sleep.....");
	}
	public void yeal(){
		System.out.println("dog wang wang wang......");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("Cat eat fish.....");
	}
	public void sleep(){
		System.out.println("Cat sleep.....");
	}
	public void yeal(){
		System.out.println("cat miao miao miao......");
	}
}
class AnimalTool{
	public static void useAnimal(Animal a){
		a.sleep();
		a.eat();
	}
}
public class PolymorphicDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Dog();
		a1.sleep();
//		Dog d1 = (Dog)a1;
//		a1.yeal();
//		Animal a12 = new Dog();
//		Dog d1 = (Dog)a12;
//		a12.y
	
		System.out.println("-----------");
		Animal a2 = new Cat();
		a2.sleep();
		System.out.println("-----------");
		Cat c1 = new Cat();
		c1.eat();
		c1.sleep();
		System.out.println("-----------");
		Cat c2 = new Cat();
		c2.eat();
		c2.sleep();
		
		System.out.println("-----------");
		AnimalTool.useAnimal(a1);
		AnimalTool.useAnimal(a2);
		System.out.println("-----------");
		AnimalTool.useAnimal(c1);
		AnimalTool.useAnimal(c2);

		
	}

}
