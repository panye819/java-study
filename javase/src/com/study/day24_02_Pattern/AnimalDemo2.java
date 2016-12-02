package com.study.day24_02_Pattern;

/**
 *工厂方法模式概述：
 *	工厂方法模式中，抽取了工厂类负责定义创建对象的接口，具体对象的创建工作有继承抽象工厂的具体类实现
 *	优点：
 *		客户端不再负责具体对象的创建，从而明确了各个类的职责，如果有新的对象增加，只需要新增一个具体的类和具体的工厂类即可
 *		不影响已有的代码，后期维护容易，增强了系统的扩展性。
 *	缺点：
 *		需要编写额外的代码，增加了工作量。
 */
public class AnimalDemo2 {
	
	public static void main(String[] args) {
		//我要一只狗
		Factory f = new DogFactory();
		Animal a4 = f.createAnimal();
		a4.eat();
		System.out.println("-----------");
		//我要一只猫
		Factory f1 = new CatFactory();
		Animal a5 = f1.createAnimal();
		a5.eat();
		System.out.println("-----------");
		//我要一只猪
		Factory f2 = new PigFactory();
		Animal a6 = f2.createAnimal();
		a6.eat();
		}
}

