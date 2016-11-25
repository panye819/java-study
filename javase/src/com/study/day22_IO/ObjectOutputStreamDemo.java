package com.study.day22_IO;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ObjectOutputStream
 * 		 �� Java ����Ļ����������ͺ�ͼ��д�� OutputStream������ʹ�� ObjectInputStream ��ȡ���ع�������
 * 		ͨ��������ʹ���ļ�����ʵ�ֶ���ĳ־ô洢��������������׽����������������һ̨�����ϻ���һ���������ع�����
 *	
 *	���л������Ѷ��������ķ�ʽ�����ı��ļ������������д��䣺����---����ObjectOutputStream��
 *	�����л����� ���ı��ļ��е����������ݻ��������е����������ݻ�ԭ�ɶ�����---����ObjectInputStream��
 *	
 *	��ͨ��ʵ�� java.io.Serializable�ӿ���ʵ�����л��ͷ����л�
 *	��ɫ���������⣬���������л�IDֵû��ָ����ɵġ�
 */
public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//���л�������ʵ���ǽ�����д�뵽�ļ�
//		write();
		read();
	}

	private static void read() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		//��ԭ����
		
		Object obj = ois.readObject();
		ois.close();
		System.out.println(obj);
		
		
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream("oos.txt"));
		
		//��������
		Person p1 = new Person("����ϼ", 27);
		
		oos.writeObject(p1);
		//java.io.NotSerializableException
		//
		oos.close();
		
	
				
		
	}
	

}
