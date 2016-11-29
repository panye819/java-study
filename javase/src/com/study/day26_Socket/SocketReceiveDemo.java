package com.study.day26_Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 */
public class SocketReceiveDemo {

	public static void main(String[] args) throws IOException {
		// 创建socket对象
		DatagramSocket ds = new DatagramSocket(10086);
		//创建数据包
		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, length);
		//调用socket方法接收数据
		ds.receive(dp);
		//解析数据包，并显示在控制台
		//获取对方IP
		InetAddress address = dp.getAddress();
		String ip = address.getHostAddress();
		//接收数据并显示在控制台
		byte[] by2 = dp.getData();
		int length2 = dp.getLength();
		String s = new String(by2, 0, length2);
		System.out.println(ip+" : "+s);
		
		//释放资源
		ds.close();
		

		
	}

}
