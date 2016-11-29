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
		// ����socket����
		DatagramSocket ds = new DatagramSocket(10010);
		//�������ݰ�
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		//����socket������������
		ds.receive(dp);
		//�������ݰ�������ʾ�ڿ���̨
		//��ȡ�Է�IP
		String ip = dp.getAddress().getHostAddress();
		//�������ݲ���ʾ�ڿ���̨
		String s = new String(dp.getData(), 0, dp.getLength());
		System.out.println("from"+ip+" data is : "+s);
		
		//�ͷ���Դ
//		ds.close();
		

		
	}

}
