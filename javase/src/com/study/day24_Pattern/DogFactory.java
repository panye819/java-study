package com.study.day24_Pattern;

public class DogFactory implements Factory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Dog();
	}

}
