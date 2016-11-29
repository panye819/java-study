package com.study.day26_Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * 端口：
 * 	正在运行的程序的标识
 * 	有效端口：0~65535，其中0~1024被系统占用或保留端口。
 * 协议：
 * 	通信的规则：
 * 		TCP:
 * 			建立连接，形成传输数据的通道，在连接中进行大数据量传输，
 * 			通过三次握手完成连接，是可靠的协议
 * 			必须建立连接，效率低
 * 		UDP:
 * 			将数据源和目的封装在数据包中，不需要建立连接
 * 			每个数据报的大小限制在64K以内
 * 			因无连接，所以是不可靠的协议
 * 			不需要建立连接，效率高
 *	socket（套接字）：
			源IP地址和目的IP地址及源端口和目的端口的组合称为套接字，用于标识客户端请求的服务器和服务。
			原理：
				1、通信两端都有socket
				2、网络通信其实就是socket之间的通信
				3、数据在两个socket之间通过IO传输
 */
public class SocketSendDemo {

	public static void main(String[] args) throws IOException {
		// 创建socket对象
		DatagramSocket ds = new DatagramSocket();
		//创建数据，并将数据打包
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		byte[] bys = "Hello,udp,我来了".getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("192.168.223.14");
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		
		
		//调用socket对象的方法，来发送数据包
		ds.send(dp);
		//释放资源
		ds.close();
		
	}

}
