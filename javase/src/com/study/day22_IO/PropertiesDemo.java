package com.study.day22_IO;

import java.util.Properties;
import java.util.Set;

/**
 * Properties 
 * 	���Լ����࣬��һ�����Ժ�IO�����ʹ�õļ�����
 * 	���ʾ��һ���־õ����Լ���
 * 	Properties �ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ����� 
 *
 */
public class PropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		prop.put("it001", "�����");
		prop.put("it002", "����");
		prop.put("it003", "����");
		
		System.out.println("prop contain: "+prop);
		
		Set<Object> set = prop.keySet();
		for(Object key :set){
			Object value = prop.get(key);
			System.out.println(key+" : "+value);
			
		}
	}

}
