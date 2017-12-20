package lesson63_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;



public class IutputStreamDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建file对象
		File file = new File("/Users/castlepan/Downloads/demo.txt");
		//声明字节输出流
		InputStream input = null;
		input = new FileInputStream(file);
		byte b[] = new byte[(int) file.length()];
		input.read(b);
		System.out.println(new String(b));
		input.close();
				
		//通过子类实例化


	}

}
