package com.study.day24_01_Pattern;

public class PigFactory implements Factory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Pig();
	}

}
