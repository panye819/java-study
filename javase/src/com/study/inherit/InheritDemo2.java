package com.study.inherit;
/**
 * this�������Ӧ������
 * super������洢�ռ�ı�ʶ��Ҳ�������Ϊ���������
 * 
 *
 */

class Father{
	public int num = 2;
}

class Son extends Father{
	public int num = 20;
	public void show(){
		int num = 200;
		System.out.println("num: "+num);
		System.out.println("this.num: "+this.num);
		System.out.println("super.num: "+super.num);
	}
}

public class InheritDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s1 = new Son();
		s1.show();
		
	}

}
