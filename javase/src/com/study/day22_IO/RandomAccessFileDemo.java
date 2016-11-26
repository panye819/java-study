package com.study.day22_IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��������� RandomAccessFile
 *	�����ʵ���������κ�������Object������࣬�ں���OutputStream��InputStream�Ĺ��ܣ�֧�ֶ���������ļ��Ķ�ȡ��д�롣
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		write();
		read();

	}

	private static void read() throws IOException{
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		int i = raf.readInt();
		System.out.println(i);
		System.out.println("��ǰ�ļ�λ�õ�ָ���ǣ� "+raf.getFilePointer());
		char c = raf.readChar();
		System.out.println(c);
		System.out.println("��ǰ�ļ�λ�õ�ָ���ǣ� "+raf.getFilePointer());
		String s = raf.readUTF();
		System.out.println(s);
		System.out.println("��ǰ�ļ�λ�õ�ָ���ǣ� "+raf.getFilePointer());
		System.out.println("------------------------------------");
		//��ָ��λ�ö�ȡ
		raf.seek(4);
		c = raf.readChar();
		System.out.println(c);
		
		raf.close();
		
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("�й�");
		
		raf.close();
	}
	

}
