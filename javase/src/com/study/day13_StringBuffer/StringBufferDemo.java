package com.study.day13_StringBuffer;

/**
 * 	StringBuffer
 * 		���ַ�������ƴ��ʱ��ÿ�ζ��ᴴ��һ���µĶ��󣬼Ⱥ�ʱ���˷ѿռ䡣
 * 		StringBuffer��һ���̰߳�ȫ�Ŀɱ����С�
 * 		���췽����
 * 			StringBuffer() ����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ��� 
 *			StringBuffer(CharSequence seq) 
 *         		public java.lang.StringBuilder(CharSequence seq) ����һ���ַ�������������������ָ���� CharSequence ��ͬ���ַ��� 
 *			StringBuffer(int capacity) ����һ�������ַ���������ָ����ʼ�������ַ����������� 
 *			StringBuffer(String str) ����һ���ַ��������������������ݳ�ʼ��Ϊָ�����ַ������ݡ� 
 *		������ݣ�
 *			append,׷��Ԫ�ص��ַ�����������ĩβ
 *			insert,׷��Ԫ�ص��ַ���������ָ������ֵλ��
 *		ɾ�����ݣ�
 *			delete charAt(int index)ɾ��ָ������ֵλ�õ��ַ�
 *			delete (int start,int end)ɾ����ָ������ֵ��ʼ��ָ������ֵ����֮����ַ�
 *		�滻���ܣ�
 *			replace(int start,int end,String str)
 *		��ת�ַ�����
 *			reverse
 *		��ȡ���ܣ�
 *			public String subString(int start)
 *			public String subString(int start,int end)	
 *			ע�⣺����ֵ������String�����������StringBuffer
 *		
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("a");
		sb.append("b");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = sb1.append("hello");//���������͵�������ӵ��ַ�����������������ַ�������������
		System.out.println("sb1 is : "+sb1);
		System.out.println("sb2 is : "+sb2);
		System.out.println(sb1 == sb2);//˵��������õ���sb1����
		
		sb.insert(0, "n");
		System.out.println("after: "+sb);
		
		StringBuffer sb3 = new StringBuffer("abcdefg");
		System.out.println("before : "+sb3);
		sb3.deleteCharAt(0);
		System.out.println("after : "+sb3);
		sb3.delete(0, 2);//���󲻰���
		System.out.println("after : "+sb3);
		System.out.println("-------------");
		StringBuffer sb4 = new StringBuffer("abcdefg");
		System.out.println(sb4.delete(0, sb4.length()));
		System.out.println("-------------");
		StringBuffer sb5 = new StringBuffer("abcdefg");
		System.out.println(sb5.replace(0, 4, "hijklmn"));
		System.out.println(sb5.reverse());
		StringBuffer sb6 = new StringBuffer("abcdefg");
		System.out.println(sb6.substring(4));
		System.out.println(sb6.substring(0, 4));
		
	}

}
