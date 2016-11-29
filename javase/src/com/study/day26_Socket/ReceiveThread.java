package com.study.day26_Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
	private DatagramSocket ds;
	public ReceiveThread(DatagramSocket ds){
		this.ds =ds;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//�������ݰ�
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);
			//����socket������������
			try {
				ds.receive(dp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//�������ݰ�������ʾ�ڿ���̨
			//��ȡ�Է�IP
			String ip = dp.getAddress().getHostAddress();
			//�������ݲ���ʾ�ڿ���̨
			String s = new String(dp.getData(), 0, dp.getLength());
			System.out.println("from"+ip+" data is : "+s);
			
		}
		
		//�ͷ���Դ
//		ds.close();
		

	}

}
