package com.study.day12_String;

/**
 * 	�ַ���ת������
 * 	byte[] getBytes()  ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte �����С� 			
 * 	char[] toCharArray():���ַ���ת�����ַ����顣
 *  static String valueOf(char[] chs):���ַ�����ת��Ϊ�ַ���
 *  static String valueOf(int i):��int��������ת�����ַ���
 *  		���ﶨ��Ϊint���Ͷ�û�ж���Ϊchar���ͣ�����Ϊ�������Ϊchar���͵Ļ���ֻ�������ַ���
 *  		������Ϊint���ͣ�����ASCII�����֪���ȿ��������ַ���Ҳ���������ַ�����Ӧ������
 *  String toLowCase():���ַ���ת��ΪСд
 *  String toUpperCase():���ַ���ת��Ϊ��д
 *  String concat(String str):���ַ�ƴ������
 */
public class StringDemo6 {

	public static void main(String[] args) {
		String s = "Hello123World";
		byte[] bys = s.getBytes();
		for(int x=0;x<bys.length;x++){
//			System.out.println("s in "+x+" is "+bys[x]);
			System.out.print((char)bys[x]);//����Ĭ����������ַ���ascii��ֵ����(char)����ǿ��ת��
			}
		System.out.println("--------------");
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length;x++){
			System.out.print(chs[x]);
		}
		System.out.println("--------------");
		String s1 = String.valueOf(chs);
		System.out.println(s1);
		System.out.println("--------------");
		String s2 = String.valueOf(97);
		System.out.println(s2);
		System.out.println("--------------");
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

}
