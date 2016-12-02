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
				//创建数据，并将数据打包
				//DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
				byte[] bys = line.getBytes();
				DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.223.14"), 10010);
				//调用socket对象的方法，来发送数据包
				ds.send(dp);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//释放资源
		ds.close();

	}

}
