package com.study.day22_IO;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ObjectOutputStream
 * 		 将 Java 对象的基本数据类型和图形写入 OutputStream。可以使用 ObjectInputStream 读取（重构）对象。
 * 		通过在流中使用文件可以实现对象的持久存储。如果流是网络套接字流，则可以在另一台主机上或另一个进程中重构对象。
 *	
 *	序列化流：把对象按照流的方式存入文本文件或者在网络中传输：对象---流（ObjectOutputStream）
 *	反序列化流： 把文本文件中的流对象数据或者网络中的流对象数据还原成对象：流---对象（ObjectInputStream）
 *	
 *	类通过实现 java.io.Serializable接口来实现序列化和反序列化
 *	黄色警告线问题，是由于序列化ID值没有指定造成的。
 */
public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//序列化数据其实就是将对象写入到文件
//		write();
		read();
	}

	private static void read() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		//还原对象
		
		Object obj = ois.readObject();
		ois.close();
		System.out.println(obj);
		
		
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream("oos.txt"));
		
		//创建对象
		Person p1 = new Person("林青霞", 27);
		
		oos.writeObject(p1);
		//java.io.NotSerializableException
		//
		oos.close();
		
	
				
		
	}
	

}
