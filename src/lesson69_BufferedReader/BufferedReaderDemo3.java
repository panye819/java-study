package lesson69_BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo3 {
	public static void main(String[] args) throws Exception  {
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		int j = 0;
		System.out.println("请输入第一个数字");
		String str = null;
		boolean flag = true;
		while(flag) {
			try {
				str = buf.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (str.matches("\\d+")) {
				i = Integer.parseInt(str);
				flag = false;
			}else {
				System.out.println("请输入整数，请重新输入：");
			}	
		}
		System.out.println("请输入第二个数字");
		flag = true;
		while(flag) {
			try {
				str = buf.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (str.matches("\\d+")) {
				j = Integer.parseInt(str);
				flag = false;
			}else {
				System.out.println("请输入整数，请重新输入：");
			}	
		}
		System.out.println("数字相加："+i+" + "+j+" 和为："+(i+j));
		
		
		
		
	}
}
