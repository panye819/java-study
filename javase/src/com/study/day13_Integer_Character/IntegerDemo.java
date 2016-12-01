package com.study.day13_Integer_Character;

/**
 * 	����
 * 		д������100�Ķ����ƣ��˽��ƣ�ʮ������
 * 	�������������ͷ�װ�ɶ��󣬿����ڶ����ж������Ĺ��ܷ������������ݡ�
 * 	byte           Byte
 * 	short          Short
 * 	int            Integer
 * 	long           Long
 * 	float          Float
 * 	double         Double
 * 	char           Character
 * 	boolean        Boolean
 * 	���õĲ���֮һ�������ڻ����������ͺ��ַ���֮���ת����
 *
 */
public class IntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.toBinaryString(100));//������
		System.out.println(Integer.toOctalString(100));//�˽���
		System.out.println(Integer.toHexString(100));//ʮ������
		System.out.println("-------------");
		System.out.println(Integer.MAX_VALUE);//int�����ֵ
		System.out.println(Integer.MIN_VALUE);//int����Сֵ
		System.out.println("-------------");	
		System.out.println(Byte.MAX_VALUE);//byte�����ֵ
		System.out.println(Byte.MIN_VALUE);//byte����Сֵ
		System.out.println("-------------");
		String  s1 = "100";
		String  s2 = "abc";
		
		Integer ii = new Integer(s1);
		System.out.println("ii:"+ii);
		System.out.println("-------------");
		//
		//Ҫת�����ַ������������������,����ͻᱨNumberFormatException����
//		Integer iii = new Integer(s2);
//		System.out.println("iii:"+iii);
		
		String s3 = "100";
		int i3 = Integer.parseInt(s3);
		System.out.println("i3: "+i3);
		System.out.println("-------------");
		float f1 = Float.parseFloat(s3);
		System.out.println("f1: "+f1);
		System.out.println("-------------");
		double d1 = Double.parseDouble(s3);
		System.out.println("d1: "+d1);
		System.out.println("-------------");
		//���Ƶķ�Χ��2~36
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, 7));
		System.out.println(Integer.toString(100, 1));
		System.out.println(Integer.toString(100, 37));
		
		//�������Ƶ�ʮ����
		
	}

}
