package lesson69_BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
	private BufferedReader buf = null;
	public InputData() {
		this.buf = new BufferedReader(new InputStreamReader(System.in));
	}
	public String getString(String info) {
		String str = null;
		System.out.println(info);
		try {
			str = this.buf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	public int getInt(String info,String err) {
		int temp = 0;
		boolean flag = true;
//		System.out.print(info);
		while(flag) {
			String str = this.getString(info);
			if(str.matches("\\d+")) {
				temp = Integer.parseInt(str);
				flag = false;
			}else {
				System.out.println(err);
			}
		}
		return temp;
	}
	
}
