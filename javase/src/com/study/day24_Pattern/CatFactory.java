package com.study.day24_Pattern;

public class CatFactory implements Factory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Cat();
	}

}
