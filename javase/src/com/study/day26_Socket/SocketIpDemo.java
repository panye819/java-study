package com.study.day26_Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ���һ����û�й��췽�����п������������������
 * 	1����Աȫ���Ǿ�̬��
 * 	2���������ģʽ
 * 	3�������о�̬�������ظ���Ķ���
 *
 */
public class SocketIpDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip = InetAddress.getByName("FlyPiG8308-PC");
		InetAddress ip2 = InetAddress.getByName("www.baidu.com");
		System.out.println(ip.toString());
		//��ȡ��������
		System.out.println(ip.getHostName());
		//��ȡIP��ַ
		System.out.println(ip.getHostAddress());
		//��ȡ�ٶȵ�IP��ַ
		System.out.println(ip2.getHostAddress());
		//��ȡ��������
		System.out.println(ip2.getHostName());

	}

}
