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
			//创建数据包
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);
			//调用socket方法接收数据
			try {
				ds.receive(dp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//解析数据包，并显示在控制台
			//获取对方IP
			String ip = dp.getAddress().getHostAddress();
			//接收数据并显示在控制台
			String s = new String(dp.getData(), 0, dp.getLength());
			System.out.println("from"+ip+" data is : "+s);
			
		}
		
		//释放资源
//		ds.close();
		

	}

}
