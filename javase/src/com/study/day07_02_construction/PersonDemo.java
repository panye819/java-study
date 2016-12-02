package com.study.day07_02_construction;
/**
 * @author bluebell325
 *
 *��Զ�������й�ͬ�ĳ�Ա����ֵ��ʱ��Java���ṩ��һ���ؼ��������Σ�static�������ε������Ǳ����ж������
 *�ص㣺
 *	1��������ļ��ض�����
 *	2�������ڶ������
 *	3�������ж�����
 *
 *ע�����
 *	1����̬��������û��this�ؼ��ֵ�
 *		��⣺
 *			��̬��������ļ��ض����أ���this�����Ŷ���Ĵ��������ڣ���̬�ȶ����ȴ��ڡ�
 *	2����̬����ֻ�ܷ��ʾ�̬�ĳ�Ա�����;�̬�ĳ�Ա������
 *		��̬������
 *			��Ա������ֻ�ܷ��ʾ�̬����
 *			��Ա������ֻ�ܷ��ʾ�̬����
 *		�Ǿ�̬������
 *			��Ա�����������Ǿ�̬�ģ�Ҳ�����ǷǾ�̬��
 *			��Ա�����������Ǿ�̬�ģ�Ҳ�����ǷǾ�̬��
 *	��̬��ֻ�ܷ��ʾ�̬���Ǿ�̬���Է���һ��
 *	
 *
 */

class Person{
	String name;
	int age;
	static String country;
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Person(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
		
	}
	public void show(){
		System.out.println("����:"+name+"  ����:"+age+"  ����:"+country);
	}
	
	
}
public class PersonDemo {
	public static void main(String[] args) {
//		Person p1 = new Person("���",27,"�й�");
//		p1.show();
//		Person p2 = new Person("����",28,"�й�");
//		p2.show();
//		Person p3 = new Person("¶¶",29,"�й�");
//		p3.show();
		Person p1 = new Person("���",27,"�й�");
		p1.show();
		Person p2 = new Person("����",28);
		p2.show();
		Person p3 = new Person("¶¶",29);
		p3.show();
		
		p3.country = "����";
		p3.show();
		p1.show();
		p2.show();
	}

}
