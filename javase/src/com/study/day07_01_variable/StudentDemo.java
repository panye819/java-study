package com.study.day07_01_variable;
/*��װ������
 * 	��ָ���ض����ʵ��ϸ�ڣ��������ṩ�������ʷ�ʽ
 * 
 *�ô���
 *	����ʵ��ϸ�ڣ��ṩ�������ʷ�ʽ
 *	����˴���ĸ�����
 *	����˰�ȫ��
 *
 *��װԭ��
 *	������Ҫ�����ṩ���ʵ����ݶ���������
 *	���������أ��ṩ�����ķ����������
 * 
 * private�ؼ��֣�
 * 	��һ��Ȩ�����η�
 * 	�������γ�Ա�����ͳ�Ա����
 * 	�������εĳ�Աֻ���ڱ����б�����
 */

class Student{
	String name;
	private int age;
	
	public void setAge(int a){
		if (a < 0 || a >120){
			System.out.println("���������������");
		}else{
			age = a;
		}
	}
	public void show(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}	
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "����ϼ";
//		s.age = -27;
		s.setAge(27);
		s.show();
		
	}

}
