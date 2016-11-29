package com.study.day26_Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class uri_url {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("http", "baidu.com", "/");
		//打开一个url的连接对象
		URLConnection conn =  url.openConnection();
		InputStream in = conn.getInputStream();
		
		
	}

}
