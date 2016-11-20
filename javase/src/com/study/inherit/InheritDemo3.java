package com.study.inherit;

/**
 *  
 *�̳��й��췽���Ĺ�ϵ��
 *	1�����������еĹ��췽��Ĭ�϶�����ʸ������޲εĹ��췽��
 *		��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø����е����ݣ����ԣ������ʼ��֮ǰһ��Ҫ��ɸ������ݵĳ�ʼ����
 *		ע�⣺
 *			����ÿһ�����췽���ĵ�һ��Ĭ����䶼�ǣ�super(),
 *			�������д�ڵ�һ�����ᱨConstructor call must be the first statement in a constructor����
 *	2�����������û���޲ι��췽��������Ĺ��췽���ᱨ��
 *		����취��
 *			1�������ڸ������ṩһ���޲ι��췽��
 *			2��ͨ��ʹ��super�ؼ���ȥ��ʽ�ĵ��ø���Ĵ��ι��췽��
 *			3������ͨ��this�ؼ���ȥ���ñ�����������췽��
 *				����һ��Ҫ��һ��ȥ�����˸���Ĺ��췽�������������ݾ�û�г�ʼ����
 *			4��һ����ĳ�ʼ�����̣�
 *				��Ա������ʼ����
 *					Ĭ�ϳ�ʼ��------��ʽ��ʼ��-----���췽����ʼ��
 */
class TestFather{
//	public Test(){
//	System.out.println("TestFather�Ĵ��ι��췽��");
//	}
	public TestFather(String name){
//		System.out.println("name: "+name);
		System.out.println("TestFather�Ĵ��ι��췽��");
	}
}
class TestSon extends TestFather{
	public TestSon(){
		super("����");
		System.out.println("TestSon���޲ι��췽��");
	}
	public TestSon(String name){
		super("����");
		System.out.println("TestSon�Ĵ��ι��췽����");
	}
	
}
class Father1{
	public Father1(){
		System.out.println("father���޲ι��췽��");
	}
	public Father1(int a){
		System.out.println(a);
		System.out.println("father���вι��췽��");
	}
	
}
class Son1 extends Father1{
	public Son1(){
		System.out.println("son���޲ι��췽��");
//		super();
	}
	public Son1(int a){
		System.out.println("a: "+a);
		System.out.println("son�Ĵ��ι��췽��");
	}
	public void show(){
		System.out.println("I am a son!");
	}
}
public class InheritDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son1 s1 = new Son1();
		s1.show();
		System.out.println("----------------------");
		Son1 s2 = new Son1(1);
		s2.show();
		System.out.println("---------------");
		TestSon td = new TestSon("����ϼ");
		
		
	}

}
