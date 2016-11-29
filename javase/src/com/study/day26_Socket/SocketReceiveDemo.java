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
		// ����socket����
		DatagramSocket ds = new DatagramSocket(10086);
		//�������ݰ�
		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, length);
		//����socket������������
		ds.receive(dp);
		//�������ݰ�������ʾ�ڿ���̨
		//��ȡ�Է�IP
		InetAddress address = dp.getAddress();
		String ip = address.getHostAddress();
		//�������ݲ���ʾ�ڿ���̨
		byte[] by2 = dp.getData();
		int length2 = dp.getLength();
		String s = new String(by2, 0, length2);
		System.out.println(ip+" : "+s);
		
		//�ͷ���Դ
		ds.close();
		

		
	}

}
