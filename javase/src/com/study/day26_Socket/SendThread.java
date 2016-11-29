package com.study.day26_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SendThread implements Runnable {
	private DatagramSocket ds;
	public SendThread(DatagramSocket ds){
		this.ds =ds;
	}
	@Override
	public void run(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
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
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ͷ���Դ
		ds.close();

	}

}
