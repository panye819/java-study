package com.study.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ip {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip = InetAddress.getByName("DESKTOP-E5U47D0");
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
