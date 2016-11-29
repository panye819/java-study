package com.study.day26_Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务端接收数据
 * 	1、创建对象
 * 	2、监听客户端，返回一个对应的socket对象
 * 	3、获取输入流，读取数据显示在控制台
 * 	4、释放资源
 *
 */
public class ServerDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//创建对象
		ServerSocket ss = new ServerSocket(8888);
		//监听客户端
		Socket s = ss.accept();
		
		//获取输入流，将数据显示在控制台
		InputStream is = s.getInputStream();
		
		byte[] bys = new byte[1024];
		int length = is.read(bys);
		String str = new String(bys, 0, length);
		String ip = s.getInetAddress().getHostAddress();
		System.out.println("from "+ip+" 数据是："+str);
		//释放客户端资源
		s.close();
	}
}
