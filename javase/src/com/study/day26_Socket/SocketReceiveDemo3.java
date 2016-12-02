package com.study.day26_Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 */
public class SocketReceiveDemo3 {

	public static void main(String[] args) throws IOException {
		// 创建socket对象
		DatagramSocket ds = new DatagramSocket(10010);
		//创建数据包
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		//调用socket方法接收数据
		ds.receive(dp);
		//解析数据包，并显示在控制台
		//获取对方IP
		String ip = dp.getAddress().getHostAddress();
		//接收数据并显示在控制台
		String s = new String(dp.getData(), 0, dp.getLength());
		System.out.println("from"+ip+" data is : "+s);
		
		//释放资源
//		ds.close();
		

		
	}

}
