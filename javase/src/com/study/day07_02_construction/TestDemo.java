package com.study.day07_02_construction;
/**
 * @author bluebell325
 *����һ��demo�࣬���ж���һ����������ݺ͵ķ�����
 *����һ��������Test�����в���
 */

/**
 * ��Ƶ�в��Ƽ���д������Ϊ��Ա������û�к��ʵ�����������ԣ���Ա�����ķ�ΧԽСԽ�ã�������Ա�����Ŀ��Ա���ʱ����
 * class Demo{
	int a;
	int b;
//	int c = a+b;
	public int numAdd(int a,int b){
		return a+b;
		
	}
}
public class TestDemo {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		System.out.println(d.numAdd(5, 6));
	}

}
 *
 */
//�޸İ�
class Demo{

//	int c = a+b;
	public int numAdd(int a,int b){
		return a+b;
		
	}
}
public class TestDemo {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		System.out.println(d.numAdd(5, 6));
	}

}
