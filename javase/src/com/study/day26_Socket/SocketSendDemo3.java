package com.study.day26_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 */
public class SocketSendDemo3 {

	public static void main(String[] args) throws IOException {
		// ����socket����
		DatagramSocket ds = new DatagramSocket();
		//��������¼�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line=br.readLine()) != null){
			if("886".equals(line)){
				break;
			}
			//�������ݣ��������ݴ��
			//DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
			byte[] bys = line.getBytes();
			DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.223.14"), 10010);
			//����socket����ķ��������������ݰ�
			ds.send(dp);
		}
		//�ͷ���Դ
		ds.close();
		
	}

}
