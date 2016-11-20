package com.study.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ip {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip = InetAddress.getByName("DESKTOP-E5U47D0");
		InetAddress ip2 = InetAddress.getByName("www.baidu.com");
		System.out.println(ip.toString());
		//获取主机名称
		System.out.println(ip.getHostName());
		//获取IP地址
		System.out.println(ip.getHostAddress());
		//获取百度的IP地址
		System.out.println(ip2.getHostAddress());
		//获取主机名称
		System.out.println(ip2.getHostName());

	}

}
