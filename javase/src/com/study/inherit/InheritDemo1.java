package com.study.inherit;

/**
 * @author bluebell325
 *�̳и�����
 *	������д�����ͬ�����Ժ���Ϊʱ������Щ���ݳ�ȡ��������һ�����У���ô��������� �ٶ�����Щ��Ϊ�����ԣ�ֻҪ�̳�����༴�ɡ�
 *	ͨ��extends�ؼ��֣�����ʵ��������ļ̳С�
 *		class ������ extends ������{}
 *		������������Ϊ���ࡢ������߳��ࣻ
 *		��������Գ�Ϊ������������ࡣ
 *	���˼̳��Ժ����Ƕ���һ�����ʱ�������һ���Ѿ����ڵ���Ļ����ϣ������Զ����Լ����³�Ա��
 *�̳еĺô���
 *	a������˴���ĸ�����
 *	b������˴����ά����
 *	c����������֮������˹�ϵ�����ǲ�����̬��ǰ��
 *
 *�̳еı׶ˣ�
 *	a������������ǿ��
 *		������ھ�
 *			��ϣ�������Ĺ�ϵ��			
 *			�ھۣ������Լ����ĳ�����ܵ�����
 *	b�� 
 *	c�� 
 *
 *Java�м̳е��ص㣺
 *	Java��ֻ֧�ֵ��̳У���֧�ֶ�̳�
 *	Java֧�ֶ��̳�
 *Java�м̳е�ע������
 *	a������ֻ�ܼ̳и��������з�˽�еĳ�Ա����Ա�����ͳ�Ա������
 *	b�����಻�ܼ̳и����еĹ��췽�������ǿ���ͨ��super�ؼ���ȥ���ʸ����еĹ��췽��
 *	c����ҪΪ�˲��ֹ��ܶ�ȥ�̳�	
 *
 *ʲôʱ����ʹ�ü̳У�	
 *	�̳�������һ�ֹ�ϵ�������Ǹ����һ�֣��������������ʱ��Ϳ��Կ���ʹ�ü̳С�
 *
 *�̳��г�Ա�����Ĺ�ϵ��
 *	�����෽���з���һ�������Ĳ���˳��
 *		a�������෽���ľֲ���Χ�в��ң��о�ʹ��
 *		b��������ĳ�Ա��Χ�в��ң��о�ʹ��
 *		c���ڸ��෽���ĳ�Ա��Χ�в��ң��о�ʹ�ã��϶����ܷ��ʸ���ľֲ���Χ��
 *		d���������û�оͱ���
 * */
class Person{
	String name;
	int age;
	int x = 10;
	public void eat(){
		System.out.println("ȥ�Է�......");
	}
	public void sleep(){
		System.out.println("ȥ˯��......");
	}
}
class Student extends Person{
	public void show(){
		System.out.println("I am a student......");
	}
	
}
class Teacher extends Person{
	public void show(){
		System.out.println("I am a teacher");
	}
	
	
}
	public class InheritDemo1 {
	public static void main(String[] args) {
//		System.out.println("hi inherit!");
		
		Student s1 = new Student();
		s1.eat();
		s1.sleep();
		s1.show();
		System.out.println("---------------------");
		Teacher t1 = new Teacher();
		t1.eat();
		t1.sleep();
		t1.show();
		
	}

}
