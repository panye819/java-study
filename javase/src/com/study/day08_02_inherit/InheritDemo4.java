package com.study.day08_02_inherit;

/**
 * @author bluebell325
 * 
 *������д���
 */
class Fu{
	public int num = 10;
	public Fu(){
		System.out.println("fu");
	}
}
class Zi extends Fu{
	public int num = 20;
	public Zi(){
		System.out.println("zi");
	}
	public void show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
public class InheritDemo4 {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}

}
