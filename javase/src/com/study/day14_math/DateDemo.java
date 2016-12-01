package com.study.day14_math;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date	 --	 String(��ʽ��)
 * 		public final String format(Date date)
 * 
 * String -- Date(����)
 * 		public Date parse(String source)
 * 
 * DateForamt:���Խ������ں��ַ����ĸ�ʽ���ͽ��������������ǳ����࣬����ʹ�þ�������SimpleDateFormat��
 * 
 * SimpleDateFormat�Ĺ��췽����
 * 		SimpleDateFormat():Ĭ��ģʽ
 * 		SimpleDateFormat(String pattern):������ģʽ
 * 			���ģʽ�ַ��������д��?
 * 			ͨ���鿴API�����Ǿ��ҵ��˶�Ӧ��ģʽ
 * 			�� y
 * 			�� M	
 * 			�� d
 * 			ʱ H
 * 			�� m
 * 			�� s
 */
public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date dt = new Date();
		System.out.println("date is :"+dt);
		System.out.println(dt.getTime());
		System.out.println("-------------------");
		
		//���ڸ�ʽ��
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = sdf.format(dt);
		System.out.println(s);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
		String s1 = sdf1.format(dt);
		System.out.println(s1);
		System.out.println("-------------------");
		//��һ���ַ���ת��������
		//�ڰ�һ���ַ�������Ϊ���ڵ�ʱ����ע���ʽ����͸������ַ�����ʽƥ��
		String str = "2016-12-01 22:18:30";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf2.parse(str);
		System.out.println(d);
	}

}
