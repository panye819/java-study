package com.study.day26_Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 *	TCPЭ�鷢������
 *		1��
 *		2��
 *		3��
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException{
		//��������
		Socket s = new Socket("192.168.223.15", 8888);
		//�����������д����
		OutputStream os = s.getOutputStream();
		os.write("hello,tcp,������".getBytes());
		//�ͷſͻ�����Դ
		s.close();
	}
}
