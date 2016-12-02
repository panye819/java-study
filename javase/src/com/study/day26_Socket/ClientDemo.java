package com.study.day26_Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 *	TCP协议发送数据
 *		1、
 *		2、
 *		3、
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException{
		//创建对象
		Socket s = new Socket("192.168.223.15", 8888);
		//创建输出流，写数据
		OutputStream os = s.getOutputStream();
		os.write("hello,tcp,我来了".getBytes());
		//释放客户端资源
		s.close();
	}
}
