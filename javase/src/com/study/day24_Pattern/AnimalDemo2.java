package com.study.day24_Pattern;

/**
 *
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

