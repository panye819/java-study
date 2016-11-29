package com.study.day26_Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * �˿ڣ�
 * 	�������еĳ���ı�ʶ
 * 	��Ч�˿ڣ�0~65535������0~1024��ϵͳռ�û����˿ڡ�
 * Э�飺
 * 	ͨ�ŵĹ���
 * 		TCP:
 * 			�������ӣ��γɴ������ݵ�ͨ�����������н��д����������䣬
 * 			ͨ����������������ӣ��ǿɿ���Э��
 * 			���뽨�����ӣ�Ч�ʵ�
 * 		UDP:
 * 			������Դ��Ŀ�ķ�װ�����ݰ��У�����Ҫ��������
 * 			ÿ�����ݱ��Ĵ�С������64K����
 * 			�������ӣ������ǲ��ɿ���Э��
 * 			����Ҫ�������ӣ�Ч�ʸ�
 *	socket���׽��֣���
			ԴIP��ַ��Ŀ��IP��ַ��Դ�˿ں�Ŀ�Ķ˿ڵ���ϳ�Ϊ�׽��֣����ڱ�ʶ�ͻ�������ķ������ͷ���
			ԭ��
				1��ͨ�����˶���socket
				2������ͨ����ʵ����socket֮���ͨ��
				3������������socket֮��ͨ��IO����
 */
public class SocketSendDemo {

	public static void main(String[] args) throws IOException {
		// ����socket����
		DatagramSocket ds = new DatagramSocket();
		//�������ݣ��������ݴ��
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		byte[] bys = "Hello,udp,������".getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("192.168.223.14");
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		
		
		//����socket����ķ��������������ݰ�
		ds.send(dp);
		//�ͷ���Դ
		ds.close();
		
	}

}
