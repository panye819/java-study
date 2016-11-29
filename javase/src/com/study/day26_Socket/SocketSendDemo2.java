package com.study.day26_Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 */
public class SocketSendDemo2 {

	public static void main(String[] args) throws IOException {
		// 创建socket对象
		DatagramSocket ds = new DatagramSocket(12345);
		//创建数据，并将数据打包
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		byte[] bys = "hello world!".getBytes();
//		DatagramPacket dp = new DatagramPacket(bys, bys.length, "192.168.223.14", 10010);
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.223.14"), 10010);
		
		
		//调用socket对象的方法，来发送数据包
		ds.send(dp);
		//释放资源
		ds.close();
		
	}

}
