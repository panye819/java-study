package com.study.day16_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *泛型通配符
 *	<?>
 *	任意类型，如果没有明确，那么就是Object类以及任意Java类了。
 *	？extends E
 *
 *	?super E
 *
 */
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}


public class GenericDemo1 {

	public static void main(String[] args) {
		//泛型如果明确定义的时候，前后类型必须一致
		Collection <Object> c1 = new ArrayList<Object>();
//		Collection <Object> c2 = new ArrayList<Animal>();
//		Collection <Object> c3 = new ArrayList<Dog>();
//		Collection <Object> c4 = new ArrayList<Cat>();
		
		//?表示任意类型都是可以的
		Collection <?> c5 = new ArrayList<Object>();
		Collection <?> c6 = new ArrayList<Animal>();
		Collection <?> c7 = new ArrayList<Dog>();
		Collection <?> c8 = new ArrayList<Cat>();
		
		//？extends E 向下限定 
		
//		Collection <? extends Animal> c9 = new ArrayList<Object>();
		Collection <? extends Animal> c10 = new ArrayList<Animal>();
		Collection <? extends Animal> c11 = new ArrayList<Dog>();
		Collection <? extends Animal> c12 = new ArrayList<Cat>();
		
		//  ? super E 向上限定 
		Collection <? super Animal> c13 = new ArrayList<Object>();
		Collection <? super Animal> c14 = new ArrayList<Animal>();
//		Collection <? super Animal> c15 = new ArrayList<Dog>();
//		Collection <? super Animal> c16 = new ArrayList<Cat>();

		
		
		
		
		
	}

}
