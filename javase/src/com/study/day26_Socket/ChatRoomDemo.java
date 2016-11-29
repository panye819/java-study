package com.study.day26_Socket;

import java.io.IOException;
import java.net.DatagramSocket;

/**
 * @author FlyPiG8308
 *
 */
public class ChatRoomDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DatagramSocket dsSend = new DatagramSocket();
		DatagramSocket dsReceive = new DatagramSocket(10010);
		
		SendThread st = new SendThread(dsSend);
		ReceiveThread rt = new ReceiveThread(dsReceive);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		
		t1.start();
		t2.start();
		
	}

}
