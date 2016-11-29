package com.study.day26_Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP����˽�������
 * 	1����������
 * 	2�������ͻ��ˣ�����һ����Ӧ��socket����
 * 	3����ȡ����������ȡ������ʾ�ڿ���̨
 * 	4���ͷ���Դ
 *
 */
public class ServerDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//��������
		ServerSocket ss = new ServerSocket(8888);
		//�����ͻ���
		Socket s = ss.accept();
		
		//��ȡ����������������ʾ�ڿ���̨
		InputStream is = s.getInputStream();
		
		byte[] bys = new byte[1024];
		int length = is.read(bys);
		String str = new String(bys, 0, length);
		String ip = s.getInetAddress().getHostAddress();
		System.out.println("from "+ip+" �����ǣ�"+str);
		//�ͷſͻ�����Դ
		s.close();
	}
}
