package com.study.day24_01_Pattern;

/**
 * 简单工厂模式又称为静态工厂方法模式，它定义一个具体的工厂类，负责创建一些类的实例。
 * 	优点： 
 * 		客户端不再负责对象的创建，从而明确了各个类的职责
 * 	缺点：
 *		这个静态工厂类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同，就需要不停的修改工厂类，不利于后期的维护。 
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
			System.out.println("暂时没有这种方法");
		}
	}

}
