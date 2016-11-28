package com.study.day24_02_Pattern;

public class PigFactory implements Factory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Pig();
	}

}
