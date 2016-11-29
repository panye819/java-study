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
		// ����socket����
		DatagramSocket ds = new DatagramSocket(12345);
		//�������ݣ��������ݴ��
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		byte[] bys = "hello world!".getBytes();
//		DatagramPacket dp = new DatagramPacket(bys, bys.length, "192.168.223.14", 10010);
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.223.14"), 10010);
		
		
		//����socket����ķ��������������ݰ�
		ds.send(dp);
		//�ͷ���Դ
		ds.close();
		
	}

}
