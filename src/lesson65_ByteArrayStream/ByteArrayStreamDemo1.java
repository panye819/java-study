package lesson65_ByteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamDemo1 {
	public static void main(String[] args) {
		String str = "hello world";
		ByteArrayOutputStream bos = null;
		ByteArrayInputStream bis = null;
		bis = new ByteArrayInputStream(str.getBytes());
		bos = new ByteArrayOutputStream();
		int temp = 0;
		while((temp = bis.read()) != -1) {
			char c = (char) temp;
			bos.write(Character.toUpperCase(c));
		}
		String newStr = bos.toString();
		System.out.println(newStr);
		
	}
}
