package com.study.day07_02_encapsulation;

/**
 * 	��װ��
 * 		���������ض�������Ժ�ʵ��ϸ�ڣ��������ṩ�������ʷ�ʽ��
 * 		�ô���
 * 			������ʵ��ϸ�ڣ����ṩ�������ʷ�ʽ
 * 			����˴���ĸ�����
 * 			��߰�ȫ��
 * 		ԭ��
 * 			�Ѳ���Ҫ�����ṩ�����ݶ�����������
 * 			���������أ��ṩ��������������ʡ�
 * 			
 *
 */
class Student{
	String name;
	private int age;
	/**
	 * ǿ��ʹ�÷�����age��ֵ��������ֱ�Ӹ�age��ֵ��ʹ��private�ؼ���
	 * private �������γ�Ա�����ͳ�Ա����
	 * 	��private���εĳ�Աֻ���ڱ����з���
	 * 	�ṩ��Ӧ��setXXX()��getXXX()����
	 */
	public void setAge(int a){
		if(a>0 && a<120){
			age = a;
		}else{
			System.out.println("���ṩ������Ƿ�����ΧΪ1~120");
		}
	}
	public void show(){
		System.out.println("name is :"+name);
		System.out.println("age is :"+age);
	}
}
public class EncapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.show();
		System.out.println("--------------");
		//����Ա������ֵ
		s.name = "�����";
		s.setAge(38);
		System.out.println("--------------");
		//��age��ֵ
//		s.age = -27;//�����ֵ�ǲ��Ϸ���
		s.setAge(-27);
		s.show();
		
				
	}

}
