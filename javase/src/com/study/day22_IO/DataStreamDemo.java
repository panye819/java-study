package com.study.day22_IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * DataOutputStream:
 * 	数据输出流允许应用程序以适当的方式将Java基本数据类型写入输出流中，然后应用程序可以通过数据输入流读取数据
 * DataInputStream:
 * 	读取数据
 */
public class DataStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		DataOutputStream dos = new DataOutputStream(new OutputStreamWriter(new File)));
		write();
		read();
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
		dos.writeByte(10);
		dos.writeChar('a');
		dos.writeInt(100);
		dos.writeShort(1000);
		dos.writeLong(10000L);
		dos.writeFloat(12.34F);
		dos.writeDouble(12.34);
		dos.writeBoolean(true);
		
		dos.close();
		
	}

	private static void read() throws IOException {
		// TODO Auto-generated method stub
		DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
		byte b = dis.readByte();
		char c = dis.readChar();
		int i = dis.readInt();
		short s = dis.readShort();
		long l = dis.readLong();
		float f =dis.readFloat();
		double d = dis.readDouble();
		boolean boo = dis.readBoolean();
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(boo);
		
		
		dis.close();
		}
		
	}

