package com.study.day26_Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 如果一个类没有构造方法，有可能是下面三种情况：
 * 	1、成员全部是静态的
 * 	2、单例设计模式
 * 	3、类中有静态方法返回该类的对象。
 *
 */
public class SocketIpDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip = InetAddress.getByName("FlyPiG8308-PC");
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
