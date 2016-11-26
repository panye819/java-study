package com.study.day22_IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机访问流 RandomAccessFile
 *	此类的实例不属于任何流，是Object类的子类，融合了OutputStream和InputStream的功能，支持对随机访问文件的读取和写入。
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
		System.out.println("当前文件位置的指针是： "+raf.getFilePointer());
		char c = raf.readChar();
		System.out.println(c);
		System.out.println("当前文件位置的指针是： "+raf.getFilePointer());
		String s = raf.readUTF();
		System.out.println(s);
		System.out.println("当前文件位置的指针是： "+raf.getFilePointer());
		System.out.println("------------------------------------");
		//从指定位置读取
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
		raf.writeUTF("中国");
		
		raf.close();
	}
	

}
