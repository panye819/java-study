package lesson69_BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo1 {
	public static void main(String[] args) throws Exception  {
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入内容：");
		String str = buf.readLine();
		System.out.println("输入的内容是："+str);
		
		
	}
}
