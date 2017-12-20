package lesson69_BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo2 {
	public static void main(String[] args) throws Exception  {
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		int j = 0;
		System.out.println("请输入第一个数字");
		String str = null;
		try {
			str = buf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i = Integer.parseInt(str);
		System.out.println("请输入第二个数字");
		try {
			str = buf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j = Integer.parseInt(str);
		System.out.println("数字相加："+i+" + "+j+" 和为："+(i+j));
		
		
		
		
	}
}
